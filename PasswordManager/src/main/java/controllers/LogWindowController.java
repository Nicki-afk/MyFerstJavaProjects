package controllers;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

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
    private Button singUnButton;

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
    private TextField numberFiled;

    @FXML
    private TextField lastNameFiled;

    @FXML
    private TextField countryFiled;

    @FXML
    private DatePicker dateFiled;

    @FXML
    private AnchorPane mainPane;



    @FXML
    void initialize() {



        mainPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println( passFiled.getText().getBytes(StandardCharsets.UTF_8).length);
                // key events
            }
        });

        singUnButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {





            }
        });




    }
}
