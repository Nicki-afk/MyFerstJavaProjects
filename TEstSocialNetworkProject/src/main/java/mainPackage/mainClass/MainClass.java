package mainPackage.mainClass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainPackage.mainClass.ORM.Database;
import mainPackage.mainClass.ORM.Executor;
import mainPackage.mainClass.ORM.baseObject.Table;

public class MainClass extends Application {
    public static void main(String[] args) {

        //launch();
        System.out.println(new Database().dropDataBase("simple"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/resources/sinUpWindow.fxml"));
        primaryStage.setScene(new Scene(pane));
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
