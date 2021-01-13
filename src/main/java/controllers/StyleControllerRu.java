package controllers;

import java.awt.*;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import mainLogic.ApplicationManager;
import mainLogic.Currency;
import mainLogic.Wther;

public class StyleControllerRu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button settingsButton;

    @FXML
    private Text thisTemp;

    @FXML
    private Text dollarCurrecyText;

    @FXML
    private Text eurCurrencyText;

    @FXML
    private Button mailRuButton;

    @FXML
    private Button facebookButton;

    @FXML
    private Text gbpCurrencyText;

    @FXML
    private Text helloText;

    @FXML
    private Text minTemp;

    @FXML
    private Text thereTemp;

    @FXML
    private Text pressure;

    @FXML
    private Text maxTemp;

    @FXML
    void facebookButtonClick(ActionEvent event) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://www.facebook.com/"));
            facebookButton.getScene().getWindow().hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void facebookOnMauseEntered(MouseEvent event) {
        facebookButton.setStyle("-fx-background-color : #0000CD");
        facebookButton.setFont(new Font(17));

    }

    @FXML
    void facebookOnMauseExited(MouseEvent event) {
        facebookButton.setStyle("-fx-background-color : blue");
        facebookButton.setFont(new Font(15));

    }

    @FXML
    void mailOnMauseClicked(MouseEvent event) {

    }

    @FXML
    void mailRuButtonClick(ActionEvent event) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://mail.ru/"));
            mailRuButton.getScene().getWindow().hide();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void mailRuOnMauseExited(MouseEvent event) {
        mailRuButton.setStyle("-fx-background-color : #6495ED");
        mailRuButton.setFont(new Font(15));

    }

    @FXML
    void mailRuOnMouseEntered(MouseEvent event) {
        mailRuButton.setStyle("-fx-background-color : #1E90FF");
        mailRuButton.setFont(new Font(17));

    }

    @FXML
    void settingsButtonClick(ActionEvent event) {

    }

    @FXML
    void settingsOnMauseEntered(MouseEvent event) {
        settingsButton.setStyle("-fx-background-color : #00BFFF");

    }

    @FXML
    void settingsOnMauseExited(MouseEvent event) {
        settingsButton.setStyle("-fx-background-color : #1E90FF");

    }

    @FXML
    void initialize() {
//        Wther wther = new Wther(); wther.getWther();
        helloText.setText( new ApplicationManager().getNameUser());
//        maxTemp.setText(wther.getMaxTemp() + "°");
//        minTemp.setText(wther.getMinTemp() + "°");
//        thisTemp.setText(wther.getTemp() + "°");
//        thereTemp.setText(wther.getThereTemp() + "°");
//        pressure.setText(Integer.toString(wther.getPressure()));


        dollarCurrecyText.setText(Float.toString(new Currency("USD").getUsd_userCurrency()));
        eurCurrencyText.setText(Float.toString(new Currency("EUR").getEur_userCurrency()));
        gbpCurrencyText.setText(Float.toString(new Currency("GBP").getGbp_userCurrency()));

    }
}
