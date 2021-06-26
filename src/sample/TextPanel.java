package sample;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class TextPanel extends Pane {
    TextArea summaryText;
    Model model;

    public TextPanel(){
        summaryText = new TextArea("\n\n\n\n\n\n\n\n\n\n\n");
        summaryText.setPrefWidth(200);
        summaryText.setPrefHeight(600);
        this.getChildren().add(summaryText);
    }

    public void setModel(Model newModel){ model = newModel;}

//    public void modelChanged() {
//        if(Model.item1 > 0){
//            summaryText.appendText(Model.item1 + " scoops of Chocolate: " + "$" +Model.item1 + ".00\n");
//        }
//
//    }
}
