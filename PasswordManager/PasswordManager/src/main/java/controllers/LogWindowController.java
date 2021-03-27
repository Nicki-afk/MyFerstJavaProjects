package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import mainLogic.WindowManager;

public class LogWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField mailFiled;

    @FXML
    private PasswordField passFiled;

    @FXML
    private PasswordField rewritePassFiled;

    @FXML
    private Button logInButton;

    @FXML
    private Button singInButton;

    @FXML
    private MenuButton langMenuButton;

    @FXML
    private MenuItem ruButton;

    @FXML
    private MenuItem enButton;

    @FXML
    private TextField nameFiled;

    @FXML
    private Text errorText;

    @FXML
    void initialize() {

//        logInButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//                if(!passFiled.getText().equals(rewritePassFiled.getText())) {
//                   errorText.setText("The fields password don't match");
//                }else{
//                    ProcessDataFiled process = new ProcessDataFiled(new TextField[]{nameFiled,mailFiled,passFiled,rewritePassFiled});
//                    if(!process.prepareQuaryToDatabase()){
//                        errorText.setText("The User already exists , try logging in");
//                    }else {
//                        logInButton.getScene().getWindow().hide();
//                        new WindowManager("/files/enStyle.fxml");
//                    }
//                }
//            }
//        });
//        singInButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                singInButton.getScene().getWindow().hide();
//                new WindowManager("/files/sigInStyle.fxml");
//            }
//        });
//



    }
}
