package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import checkError.Checker;
import corePackage.Core;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerApp {
    private String commandText = "COMMAND STROKE OUTPUT >>  ";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button runButton;

    @FXML
    private TextArea mainStroke;

    @FXML
    private TextArea compileFiled;

    @FXML
    void runButtonClick(ActionEvent event) {
        Core core = new Core(mainStroke.getText());
         Checker checker = new Checker(mainStroke.getText());
         if(checker.checkErrorCode(mainStroke.getText()) == 1){
             compileFiled.setText(core.output(mainStroke.getText()));
         }else{
             compileFiled.setText(commandText + checker.err);
         }

    }

    @FXML
    void initialize() {

    }
}
