package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;

public class ControllerStyleApp {
    //properties
    public double numberOne;
    public double numberTwo;
    public String oper;
    public double resultexample;

    @FXML
    private Button dotButton;

    @FXML
    private Button devisionWithRemainderButton;

    @FXML
    private Button delButton;

    @FXML
    private TextField resultFiled;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button forButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button shareButtom;

    @FXML
    private Button answerButton;

    @FXML
    private Text textVersionProduct;



    @FXML
    void eightButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                    || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("8");
        }else{
            resultFiled.setText(resultFiled.getText() + "8");
        }

    }

    @FXML
    void fiveButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                        || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {

            resultFiled.setText("5");
        }else{
            String num = resultFiled.getText() + "5";
            resultFiled.setText(num);
        }

    }

    @FXML
    void forButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                     || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("4");
        }else{
                resultFiled.setText(resultFiled.getText() + "4");
        }

    }

    @FXML
    void minusButtonOper(ActionEvent event) {
        numberOne = Double.valueOf(resultFiled.getText());
        resultFiled.setText("-");
        oper = "-";


    }

    @FXML
    void multiplyButtonOper(ActionEvent event) {
        numberOne =  Double.valueOf(resultFiled.getText());
        resultFiled.setText("x");
        oper = "x";

    }

    @FXML
    void nineButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                     || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("9");
        }else{
            resultFiled.setText(resultFiled.getText() + "9");
        }

    }

    @FXML
    void oneButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                     || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {

            resultFiled.setText("1");
        }else{
            String num = resultFiled.getText() + "1";
            resultFiled.setText(num);
        }

    }

    @FXML
    void plusButtonOper(ActionEvent event) {
        numberOne = Double.valueOf(resultFiled.getText());
        resultFiled.setText("+");
        oper = "+";

    }

    @FXML
    void sevenButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                     || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            String num =  "7";
            resultFiled.setText(num);
        }else{
            String num = resultFiled.getText() + "7";
            resultFiled.setText(num);
        }

    }

    @FXML
    void shareButtonOper(ActionEvent event) {
        numberOne =  Double.valueOf(resultFiled.getText());
        resultFiled.setText("/");
        oper = "/";

    }

    @FXML
    void sixButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
        || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("6");
        }else{
            resultFiled.setText(resultFiled.getText() + "6");
        }

    }

    @FXML
    void threeButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
        || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("3");
        }else{
            String num = resultFiled.getText() + "3";
            resultFiled.setText(num);
        }
    }

    @FXML
    void twoButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                        || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("2");
        }else{
            resultFiled.setText(resultFiled.getText() + "2");
        }
    }

    @FXML
    void zeroButtonClick(ActionEvent event) {
        if(resultFiled.getText().equals("+") || resultFiled.getText().equals("-")
                || resultFiled.getText().equals("x") || resultFiled.getText().equals("/")
                    || resultFiled.getText().equals("0") || resultFiled.getText().equals("%")) {
            resultFiled.setText("0");
        }else{
            resultFiled.setText(resultFiled.getText() + "0");
        }
    }

    @FXML
    void delButtonClick(ActionEvent event){
        resultFiled.setText("0");

    }
    @FXML
    void answerButtonClick(ActionEvent event){
        try {
            numberTwo = Integer.parseInt(resultFiled.getText());
            if (oper.equals("-")) {
                resultexample = numberOne - numberTwo;
                resultFiled.setText(Double.toString(resultexample));
            } else if (oper.equals("+")) {
                resultexample = numberOne + numberTwo;
                resultFiled.setText(Double.toString(resultexample));
            } else if (oper.equals("x")) {
                resultexample = numberOne * numberTwo;
                resultFiled.setText(Double.toString(resultexample));
            } else if (oper.equals("/")) {
                if(numberOne == 0 || numberTwo == 0){
                    resultFiled.setText("Oper. impossible");

                }else {
                    resultexample = numberOne / numberTwo;
                    resultFiled.setText(Double.toString(resultexample));
                }

            } else if(oper.equals("%")){
                if(numberOne == 0 || numberTwo == 0){
                    resultFiled.setText("Oper. impossible");

                }else {
                    resultexample = numberOne % numberTwo;
                    resultFiled.setText(Double.toString(resultexample));
                }


            }
        }catch (Exception e){
            resultFiled.setText("Critical Error");
        }

    }
    @FXML
    void devisionWithRemainderButtonClick(ActionEvent event){
        numberOne =  Double.valueOf(resultFiled.getText());
        resultFiled.setText("%");
        oper = "%";

    }

    @FXML
    void dotButtonClick(ActionEvent event){
        resultFiled.setText(resultFiled.getText() + ".");

    }

}
