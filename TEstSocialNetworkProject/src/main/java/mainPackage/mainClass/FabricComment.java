package mainPackage.mainClass;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.awt.*;

public class FabricComment {

    private String text;
    private static FabricComment fabricComment;
    private Text comment;
    private Pane pane;
    private final double prefWight = 400;



    public static FabricComment getInstance(String text){
        return fabricComment == null ? fabricComment = new FabricComment(text) : fabricComment;
    }


    private FabricComment(String text){
        this.text = text;
        pane = new Pane();
        comment = new Text(text); comment.setStrokeWidth(377.7);
        comment.setLayoutX(11); comment.setLayoutY(18); pane.setPrefSize(prefWight , text.length()+5);


    }

}
