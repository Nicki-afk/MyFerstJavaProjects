package mainPackage;

import checkError.CheckCode;
import checkError.Checker;
import corePackage.Core;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/style.fxml"));
        primaryStage.setScene(new Scene(pane)); primaryStage.show();
    }
}
