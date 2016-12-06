package core.controller;


import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import org.fxmisc.richtext.StyleClassedTextArea;

public class IdeController {
    @FXML
    public MenuItem newButton;
    @FXML
    public MenuItem saveAsButton;
    @FXML
    public MenuItem saveButton;
    @FXML
    public MenuItem exitButton;
    @FXML
    public MenuItem openButton;
    @FXML
    public MenuItem runButton;
    @FXML
    public StyleClassedTextArea codeTextArea;
}
