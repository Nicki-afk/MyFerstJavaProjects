package controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import AbstractClasses.ProcessingData;
import MainClasses.CheckPasswordUser;
import MainClasses.LoadWindow;
import MainClasses.ProccesingDataEN;
import MainClasses.ProcessingDataRU;
import configFiles.FileSettings;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import mainPackage.MainClass;
import sun.applet.Main;

public class ClassStyleControllerRu {

    private ProcessingData process;
    private String passUser;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField passwordFiledUser;

    @FXML
    private TextField passwordFiledRecomondedPass;

    @FXML
    private ToggleButton ruTongleButton;

    @FXML
    private ToggleButton enToungleButton;

    @FXML
    private Text percentageText;

    @FXML
    private Text recomendationText;

    @FXML
    private Button checkButton;

    @FXML
    void checkButtonClick(ActionEvent event) {
        if(passwordFiledUser.getText() == null){
            recomendationText.setText("Поле не может быть пустым!");
        }else {
            executableMethod();
        }
    }


    @FXML
    void enToungleButtonClick(ActionEvent event) {
        try {
            new MainClass().chooseAnInterface().setTextToFile("EN");
            enToungleButton.getScene().getWindow().hide();
            new LoadWindow().loadWindow("/style.fxml");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void ruTongleButtonClick(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    public void executableMethod(){
        passUser = passwordFiledUser.getText();
        CheckPasswordUser checker = new CheckPasswordUser(passUser);
        process = new ProcessingDataRU(checker);
        recomendationText.setText(process.resultCheck(checker));
        percentageText.setText(Float.toString(checker.getPercentage()));
        passwordFiledRecomondedPass.setText(process.recomondedPassword());
    }

}
