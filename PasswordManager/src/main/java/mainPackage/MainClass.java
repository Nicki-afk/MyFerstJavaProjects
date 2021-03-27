package mainPackage;

import domain.Executor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainLogic.Hash;
import mainLogic.PManager;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass extends Application {

    public static void main(String[] args) {
//        System.out.println(new Executor().isConnect());

        launch();
//     System.out.println(PManager.getPASSWORD());
//        System.out.println(new Hash().getHash("password"));
//        System.out.println("{}");
//        System.out.println(new Hash().getHash("password"));

//        Scanner scanner = new Scanner(System.in);
//        String x = scanner.nextLine();
//        String y = new Hash().getHash(x);
//         if(y.equals(new Hash().getHash(x))){
//             System.out.println("OK");
//         }else{
//             System.out.println("NON!");
//         }




    }

    @Override
    public void start(Stage stage) throws Exception {
//        AppManager.getInstance().startApp();
           AnchorPane pane = FXMLLoader.load(getClass().getResource("/files/logStyle.fxml"));
           stage.setScene(new Scene(pane)); stage.setResizable(false);
           stage.show();
    }
}
