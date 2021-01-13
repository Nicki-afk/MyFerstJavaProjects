package mainLogic;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoagWindow {

    public LoagWindow(String name_file){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(name_file));
            loader.load();
            Parent parent = loader.getRoot();
            Stage stage = new Stage(); stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.showAndWait();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
