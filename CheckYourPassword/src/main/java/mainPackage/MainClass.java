package mainPackage;

import AbstractClasses.ProcessingData;
import MainClasses.CheckPasswordUser;
import MainClasses.LoadWindow;
import MainClasses.ProcessingDataRU;
import configFiles.FileSettings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.applet.Main;

import java.io.File;
import java.io.IOException;



public class MainClass extends Application {
    private String text;
    public static File file;
    public static FileSettings fileSettings;



    public MainClass chooseAnInterface(){
        try {
            file = new File("settings.txt");
            fileSettings = new FileSettings(file);
            if (fileSettings.readToFile() != null) {
                    text = fileSettings.readToFile();
            }else{
                text = "EN";
                fileSettings.writeTextFile(text);
            }

            return this;
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static File getFile() {
        return file;
    }

    public  void setTextToFile(String text) {
        fileSettings.writeTextFile(text);
    }






    public static void main(String[] args) throws IOException {
        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {
//        fileSettings = new FileSettings("SettingsFile.txt");
//        fileSettings.writeTextFile("EN");
        chooseAnInterface();
                if(!fileSettings.readToFile().equals("EN")){
                   AnchorPane pane = FXMLLoader.load(getClass().getResource("/styleRu.fxml"));
                    primaryStage.setScene(new Scene(pane)); primaryStage.setResizable(false);
                    primaryStage.show();

                }else {
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("/style.fxml"));
                    primaryStage.setScene(new Scene(pane)); primaryStage.setResizable(false);
                    primaryStage.show();
                }
    }
}
