package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Interfaces.Manager;
import fileSettings.FileManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import mainLogic.ApplicationManager;
import mainLogic.LoagWindow;
import mainPackage.MainClass;

public class FerstWindowController {

    private String fxml_file = "/styleApplication.fxml";
    private FileManager manager;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameFiled;

    @FXML
    private TextField countryFiled;

    @FXML
    private TextField cityFiled;

    @FXML
    private SplitMenuButton languageSplitMenu;

    @FXML
    private MenuItem ruMenuButton;

    @FXML
    private MenuItem enMenuButton;

    @FXML
    private Button continueButton;

    @FXML
    private Text wrongText;

    @FXML
    private TextField currencyFiled;

    @FXML
    void continueButtonClick(ActionEvent event) {
        new ApplicationManager(nameFiled , countryFiled , cityFiled , languageSplitMenu.getText(), currencyFiled);
        continueButton.getScene().getWindow().hide();
        if(!languageSplitMenu.getText().equals("ENGLISH")){
            new LoagWindow("/styleApplicationRu.fxml");
        }else{
            new LoagWindow("/styleApplication.fxml");
        }

    }

    @FXML
    void enMenuButtonClick(ActionEvent event) {
        languageSplitMenu.setText(enMenuButton.getText());

    }

    @FXML
    void ruMenuButtonClick(ActionEvent event) {
        fxml_file = "/styleApplicationRu.fxml";
        languageSplitMenu.setText(ruMenuButton.getText());

    }

    @FXML
    void initialize() {



    }
}
