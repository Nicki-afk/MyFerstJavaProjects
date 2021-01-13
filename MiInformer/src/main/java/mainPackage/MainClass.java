package mainPackage;

import fileSettings.FileManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainLogic.ApplicationManager;
import mainLogic.Currency;
import mainLogic.Wther;

import java.io.File;

public class MainClass extends Application {

    public ApplicationManager manager = new ApplicationManager();


    public static void main(String[] args) {


//        new FileManager("settings.txt");
//        System.out.println(new FileManager().checkFile("settings.txt"));
//        FileManager manager =
//                new FileManager("settings.txt" , "Nick" , "Moldova"  , "EN" , "city" , "mdl" );

        launch();
//       System.out.println(new Currency("USD").getUsd_userCurrency());
//        System.out.println(new Currency("EUR").getUsd_userCurrency());
//        System.out.println(new Currency("GBP").getUsd_userCurrency());






    }

    public void start(Stage primaryStage) throws Exception {
        manager.startApp();

    }
}
