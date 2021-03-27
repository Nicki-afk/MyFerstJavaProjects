package controllers;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import mainLogic.WindowManager;

public class SignInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField mailFiled;

    @FXML
    private PasswordField passFiled;

    @FXML
    private Button singInButton;

    @FXML
    private Text errorText;

    @FXML
    private Button logInButton;

    @FXML
    void initialize() {


        logInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logInButton.getScene().getWindow().hide();
                new WindowManager("/files/logStyle.fxml");
            }
        });

        singInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                if(!DAO.getInstance().select(mailFiled.getText(), passFiled.getText())) {
//                    errorText.setText("User not found , check the data in store");
//                }else{
//                    singInButton.getScene().getWindow().hide();
//                    new WindowManager("/files/enStyle.fxml");
//                }
                singInButton.getScene().getWindow().hide();
                new WindowManager("/files/enStyle.fxml");
            }
        });

    }
}
