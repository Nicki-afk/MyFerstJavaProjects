package mainPackage.mainClass.Fabric;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class GetPane {
    private final double layoutX = 14;
    private double layoutY = 20;
    private Pane pane;
    private Node node;
    private static GetPane pan;

    public static GetPane getInstance(){
        return pan == null ? pan = new GetPane() : pan;
    }


    public Pane getPane(AnchorPane anchorPane){
        pane = new Pane();
        pane.setLayoutX(layoutX); pane.setLayoutY(layoutY);
        pane.setPrefSize(531 , 65);
        pane.setStyle("-fx-background-color :  #D3D3D3"); layoutY+=73;
        anchorPane.setPrefHeight(anchorPane.getHeight()+25);
        return pane;
    }
    public Pane getComment(AnchorPane anchorPane , String text){
        pane = new Pane();



//        pane.setLayoutX(layoutX); pane.setLayoutY(layoutY);
//        pane.setPrefSize(531 , 65);
//        pane.setStyle("-fx-background-color :  #D3D3D3"); layoutY+=73;
//        anchorPane.setPrefHeight(anchorPane.getHeight()+25);
        return pane;
    }

}
