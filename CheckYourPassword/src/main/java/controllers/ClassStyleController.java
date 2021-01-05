package controllers;


import java.net.URL;
import java.util.ResourceBundle;

import AbstractClasses.ProcessingData;
import MainClasses.CheckPasswordUser;
import MainClasses.LoadWindow;
import MainClasses.ProccesingDataEN;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import mainPackage.MainClass;
import sun.applet.Main;

public class ClassStyleController {

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


    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    @FXML
    void checkButtonClick(ActionEvent event) {
        if(passwordFiledUser.getText() == null){
            recomendationText.setText("The field cannot be empty!");
        }else {
           executableMethod();
        }
    }


    @FXML
    void enToungleButtonClick(ActionEvent event) {


    }

    @FXML
    void ruTongleButtonClick(ActionEvent event) {
        try {
          new MainClass().chooseAnInterface().setTextToFile("RU");
            ruTongleButton.getScene().getWindow().hide();
            new LoadWindow().loadWindow("/styleRu.fxml");
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public void executableMethod(){
        passUser = passwordFiledUser.getText();
        CheckPasswordUser checker = new CheckPasswordUser(passUser);
        process = new ProccesingDataEN(checker);
        recomendationText.setText(process.resultCheck(checker));
        percentageText.setText(Float.toString(checker.getPercentage()));
        passwordFiledRecomondedPass.setText(process.recomondedPassword());
    }

    @FXML
    void initialize() {





    }


}
