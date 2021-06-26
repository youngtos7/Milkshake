package sample;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;


    public class Toppings extends Pane implements ModelListener{
        static Button f1, f2, f3, f4, f5, f6;
        static Image image1, image2, image3, image4, image5, image6;
        Label label1, label2, label3, label4, label5, label6;
        Model model;
        Controller controller;
        GridPane grid;
        Label topping;


        public static Button getFlav1(){
            image1 = new Image(Main.class.getResource("images/sprinkles.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv = new ImageView(image1);
            f1 = new Button("Sprinkles");
            f1.setPrefSize(200, 100);
            f1.setGraphic(iv);
            f1.setContentDisplay(ContentDisplay.LEFT);
            return f1;
        }
        public static Button getFlav2(){
            image2 = new Image(Main.class.getResource("images/cherry.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv2 = new ImageView(image2);
            f2 = new Button("Cherries");
            f2.setPrefSize(200, 100);
            f2.setGraphic(iv2);
            f2.setContentDisplay(ContentDisplay.LEFT);
            return f2;
        }
        public static Button getFlav3(){
            image3 = new Image(Main.class.getResource("images/chocolate-chips.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv3 = new ImageView(image3);
            f3 = new Button("Chocolate Chips");
            f3.setPrefSize(200, 100);
            f3.setGraphic(iv3);
            f3.setContentDisplay(ContentDisplay.LEFT);
            return f3;
        }
        public static Button getFlav4(){
            image4 = new Image(Main.class.getResource("images/whipped-cream.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv4 = new ImageView(image4);
            f4 = new Button("Whipped Cream");
            f4.setPrefSize(200, 100);
            f4.setGraphic(iv4);
            f4.setContentDisplay(ContentDisplay.LEFT);
            return f4;
        }
        public static Button getFlav5(){
            image5 = new Image(Main.class.getResource("images/coconut.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv5 = new ImageView(image5);
            f5 = new Button("Coconut");
            f5.setPrefSize(200, 100);
            f5.setGraphic(iv5);
            f5.setContentDisplay(ContentDisplay.LEFT);
            return f5;
        }
        public static Button getFlav6(){
            image6 = new Image(Main.class.getResource("images/marshmellow.jpg").toExternalForm(), 70, 70, true, true);
            ImageView iv6 = new ImageView(image6);
            f6 = new Button("Marshmellow");
            f6.setPrefSize(200, 100);
            f6.setGraphic(iv6);
            f6.setContentDisplay(ContentDisplay.LEFT);
            return f6;
        }

        public void setModel(Model newModel) {
            model = newModel;
        }

        public void setController(Controller newController) {
            controller = newController;

            // set up event handling
            f1.setOnAction(e -> controller.handleClick(new ToppingModel("Sprinkles")));
            f2.setOnAction(e -> controller.handleClick(new ToppingModel("Cherries")));
            f3.setOnAction(e -> controller.handleClick(new ToppingModel("Chocolate Chips")));
            f4.setOnAction(e -> controller.handleClick(new ToppingModel("Whipped Cream")));
            f5.setOnAction(e -> controller.handleClick(new ToppingModel("Coconut")));
            f6.setOnAction(e -> controller.handleClick(new ToppingModel("Marshmellow")));
        }


        public Toppings(){

            topping = new Label("Toppings");
            topping.setFont(Font.font ("Verdana", 20));


            grid = new GridPane();
            getFlav1();
            getFlav2();
            getFlav3();
            getFlav4();
            getFlav5();
            getFlav6();

            grid.add(topping, 0, 0, 1, 1);
            grid.add(f1, 0, 1, 1, 1);
            grid.add(f2, 1, 1, 1, 1);
            grid.add(f3, 0, 2, 1, 1);
            grid.add(f4, 1, 2, 1, 1);
            grid.add(f5, 0, 3, 1, 1);
            grid.add(f6, 1, 3, 1, 1);

            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(10, 10, 10, 10));

        }


        @Override
        public void modelChanged() {

        }
    }

