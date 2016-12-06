package core;
import core.controller.IdeController;
import core.gen.csssLexer;
import core.gen.csssParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;

public class Ide extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private IdeController controller;
    private FileChooser fileChooser;
    private File file;

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

    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Ide.class.getResource("view/ide.fxml"));
            rootLayout = loader.load();
            controller = loader.getController();

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

                    controller.codeTextArea.setText(result);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            controller.saveButton.setOnAction(event -> {
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
                try {
                    csssLexer lexer = new csssLexer(new ANTLRFileStream(file.getPath()));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    csssParser parser = new csssParser(tokens);
                    ParseTree tree = parser.program();

                    CsssVisitor visitor = new CsssVisitor();
                    visitor.visit(tree);
                    //TODO: possible issue
                    visitor.dump(file.getPath().replace(".csss", ".css"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });



            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
