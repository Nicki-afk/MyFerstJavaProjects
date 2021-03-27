package mainPackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainLogic.PManager;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass extends Application {

    public static void main(String[] args) {
        launch();
//     System.out.println(PManager.getPASSWORD());





    }

    @Override
    public void start(Stage stage) throws Exception {
//        AppManager.getInstance().startApp();
           AnchorPane pane = FXMLLoader.load(getClass().getResource("/files/enStyle.fxml"));
           stage.setScene(new Scene(pane)); stage.setResizable(false);
           stage.show();
    }
}
