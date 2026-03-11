package com.example.task5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();

        Rectangle rectangle1 = new Rectangle(200, 55);
        rectangle1.setFill(Color.BLUE);
        Rectangle rectangle2 = new Rectangle(100, 60);
        rectangle2.setFill(Color.BLUE);

        Circle circle1 = new Circle(24);
        circle1.setFill(Color.BLACK);
        Circle circle2 = new Circle(24);
        circle2.setFill(Color.BLACK);

        rectangle1.setLayoutX(60);
        rectangle1.setLayoutY(125);
        rectangle2.setLayoutX(108);
        rectangle2.setLayoutY(74);

        circle1.setLayoutX(108);
        circle1.setLayoutY(180);
        circle2.setLayoutX(204);
        circle2.setLayoutY(180);

        //Adds all nodes to group
        pane.getChildren().addAll(rectangle1, rectangle2, circle1, circle2);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("A car");
        stage.setScene(scene);
        stage.show();

    }
}
