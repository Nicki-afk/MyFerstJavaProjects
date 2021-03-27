package mainLogic;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowManager extends Manager{


    private FXMLLoader loader = new FXMLLoader();
    private Parent parent;
    private Stage stage = new Stage();

    @Override
    void load(String nameFile) {
        try {
            loader.setLocation(getClass().getResource(nameFile));
            loader.load();
            parent = loader.getRoot();
            stage.setScene(new Scene(parent));
            stage.setResizable(false);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public WindowManager(String name_fxml_file){
        load(name_fxml_file);
    }



}
