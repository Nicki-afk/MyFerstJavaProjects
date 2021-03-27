package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import mainLogic.PManager;


public class SettingsPasswordController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Slider sliderLengthPassword;

    @FXML
    private TextField filedLnghtPassword;

    @FXML
    private TextField mainWordFiled;

    @FXML
    private Button saveButton;

    @FXML
    private Text errorText;

    @FXML
    private CheckBox specialCharsCheckBox;

    @FXML
    private CheckBox numbersCheckBox;

    @FXML
    void initialize() {

        int value;
        filedLnghtPassword.setText(Integer.toString(value = (int)sliderLengthPassword.getValue()));


        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

//                System.out.println(sliderLengthPassword.getValue());
                if(mainWordFiled.getText() != null && !mainWordFiled.getText().equals("")){
                    if(specialCharsCheckBox.isSelected()){
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() , mainWordFiled.getText() , false );
                    }else if(numbersCheckBox.isSelected()){
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() , mainWordFiled.getText() , true);

                    }else{
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() , mainWordFiled.getText() , null );
                    }
                    saveButton.getScene().getWindow().hide();

                }else{

                    if(specialCharsCheckBox.isSelected()){
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() ,  false );
                    }else if(numbersCheckBox.isSelected()){
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() ,  true );
                    }else{
                        PManager.getInstance().generatePass((int)sliderLengthPassword.getValue() , null );
                    }
                    saveButton.getScene().getWindow().hide();

                }



            }
        });

        specialCharsCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(specialCharsCheckBox.isSelected()){
                    numbersCheckBox.setSelected(false);
                }
            }
        });
        numbersCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(numbersCheckBox.isSelected()){
                    specialCharsCheckBox.setSelected(false);
                }
            }
        });


        sliderLengthPassword.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int x = (int)sliderLengthPassword.getValue();
                filedLnghtPassword.setText(x + "");
            }
        });

//        sliderLengthPassword.setOnMouseEntered(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                int x = (int)sliderLengthPassword.getValue();
//                filedLnghtPassword.setText(x + "");
//            }
//        });
//

    }
}
