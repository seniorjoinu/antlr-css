package core;
import core.controller.IdeController;
import core.gen.csssLexer;
import core.gen.csssParser;
import core.syntax.Highlighter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;

public class Ide extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private IdeController controller;
    private FileChooser fileChooser;
    private File file;
    private csssLexer lexer;
    private csssParser parser;
    private Highlighter highlighter;
    private Alert alert;
    private TextArea alertText;
    private CsssVisitor visitor;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CSSS IDE 1.0");
        this.primaryStage.getIcons().add(new Image(Ide.class.getResourceAsStream("view/icon.png")));
        this.fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Snake style files (*.csss)", "*.csss");
        this.fileChooser.getExtensionFilters().add(filter);

        initRootLayout();
    }

    private void initAlert() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("File successfully compiled");
        alert.setHeaderText("Look, it compiled!");
        alertText = new TextArea();
        Label label = new Label("File content:");
        alertText.setEditable(false);
        alertText.setWrapText(true);

        alertText.setMaxWidth(Double.MAX_VALUE);
        alertText.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(alertText, Priority.ALWAYS);
        GridPane.setHgrow(alertText, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(alertText, 0, 1);

        alert.getDialogPane().setExpandableContent(expContent);
    }

    private void showAlert(File file) {
        alert.setContentText("Result file " + file.getPath());

        try (
                InputStream in = Files.newInputStream(file.toPath());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in))
        ) {
            String result = "";
            String line = null;
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }

            alertText.setText(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        alert.showAndWait();
    }

    private boolean hasErrors(csssParser parser) {
        try {
            for (int i = 0; i < parser.getClass().getMethods().length; i++) {
                Method cur = parser.getClass().getMethods()[i];
                if (cur.getReturnType().equals(ParserRuleContext.class)) {
                    if (((ParserRuleContext) cur.invoke(parser)).exception != null)
                        return true;
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return false;
    }

    private void highlight() {
        lexer = new csssLexer(new ANTLRInputStream(controller.codeTextArea.getText()));
        parser = new csssParser(new CommonTokenStream(lexer), controller);
        highlighter.visit(parser.program());
        /*if (!hasErrors(parser)) {
            controller.errorLabel.setText("");
        }*/
    }

    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Ide.class.getResource("view/ide.fxml"));
            rootLayout = loader.load();
            controller = loader.getController();
            visitor = new CsssVisitor();

            highlighter = new Highlighter(controller);
            initAlert();

            controller.openButton.setOnAction(event -> {
                file = fileChooser.showOpenDialog(primaryStage);
                try (
                        InputStream in = Files.newInputStream(file.toPath());
                        BufferedReader reader = new BufferedReader(new InputStreamReader(in))
                ) {
                    String result = "";
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        result += line + "\n";
                    }

                    controller.codeTextArea.replaceText(result);
                    highlight();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            controller.saveButton.setOnAction(event -> {
                if (file == null) {
                    file = fileChooser.showSaveDialog(primaryStage);
                }
                try (
                        OutputStream out = Files.newOutputStream(file.toPath());
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))
                ) {
                    writer.write(controller.codeTextArea.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            controller.saveAsButton.setOnAction(event -> {
                file = fileChooser.showSaveDialog(primaryStage);
                controller.saveButton.fire();
            });

            controller.runButton.setOnAction(event -> {
                controller.saveButton.fire();

                try {
                    lexer = new csssLexer(new ANTLRFileStream(file.getPath()));
                    parser = new csssParser(new CommonTokenStream(lexer));
                    visitor.visit(parser.program());

                    //TODO: possible issue
                    File newFile = new File(file.getPath().replace(".csss", ".css"));
                    controller.saveButton.fire();
                    visitor.dump(newFile.getPath());

                    showAlert(newFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            controller.newButton.setOnAction(event -> {
                controller.saveButton.fire();
                file = null;
                controller.codeTextArea.clear();
            });

            controller.codeTextArea.setOnKeyReleased(event -> {
                highlight();
            });

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            highlight();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
