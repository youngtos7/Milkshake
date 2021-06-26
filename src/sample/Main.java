package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Model model;
    Controller controller;
    static HBox leftBox, rightBox;
    MilkshakeModel milkshakeModel;
    ModelListener modelListener;

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox();
        HBox hbox = new HBox();

        Separator separator = new Separator();
        separator.setMaxWidth(250);
        separator.setHalignment(HPos.CENTER);

        milkshakeModel = new MilkshakeModel();
//        model = new Model();
        controller = new Controller(milkshakeModel);


        //View
        Flavour flav = new Flavour();
        Toppings toppings = new Toppings();

        TextPanel summary = new TextPanel();
        root.getChildren().addAll(flav.grid, toppings.grid);
        hbox.getChildren().add(root);

        controller.setModel(model);
        flav.setModel(model);
        toppings.setModel(model);
//        model.addSubscriber(flav);
        flav.setController(controller);
        toppings.setController(controller);

        primaryStage.setTitle("MVC Demo");
        primaryStage.setScene(new Scene(hbox, 800, 800));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
