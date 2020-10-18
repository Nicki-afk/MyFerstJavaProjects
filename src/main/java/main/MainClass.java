package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass extends Application {
    public void start(Stage stage) throws Exception {
       AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("/styleApp.fxml"));
       stage.setScene(new Scene(pane));


       stage.show();
    }
}
