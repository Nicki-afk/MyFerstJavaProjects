package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SettingsWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField gmailFiled;

    @FXML
    private TextField nameFiled;

    @FXML
    private PasswordField passFiled;

    @FXML
    private TextField countPassFiled;

    @FXML
    private Button refactorButton;

    @FXML
    private TextField lastSavePassFiled;

    @FXML
    void initialize() {


//        if(UserDataClass.getInstance().getLastDateSavePass() != null){
//            lastSavePassFiled.setText(UserDataClass.getInstance().getLastDateSavePass().toString());
//        }else{
//            lastSavePassFiled.setText("Unknown");
//        }


    }
}
