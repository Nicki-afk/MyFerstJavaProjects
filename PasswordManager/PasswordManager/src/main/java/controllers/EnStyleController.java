package controllers;

import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;


import mainLogic.PManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import mainLogic.WindowManager;

public class EnStyleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField getNamePasswordFiled;

    @FXML
    private TextField saveNamePasswordFiled;

    @FXML
    private TextField savePasswordFiled;

    @FXML
    private Button getButton;

    @FXML
    private Button saveButton;

    @FXML
    private TextField generatePasswordFiled;

    @FXML
    private Button generateButton;

    @FXML
    private Button settingsButton;

    @FXML
    private ImageView imageButton;

    @FXML
    private Text errorText;

    @FXML
    private PasswordField getPasswordFiled;

    @FXML
    private Button copiButton;

    @FXML
    private Button settingsPasswordButton;

    @FXML
    private TextField saveDateFiled;

    @FXML
    private TextField getDateFiled;

    @FXML
    void initialize() {

        saveDateFiled.setText(new GregorianCalendar().getTime().toString());

        settingsPasswordButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new WindowManager("/files/passwordSettingsStyle.fxml");
            }
        });
        generateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(PManager.getPASSWORD() != null){
                    generatePasswordFiled.setText(PManager.getPASSWORD());
                }else{
                    generatePasswordFiled.setText(PManager.getInstance().generatePass());
                }
            }
        });






    }
}
