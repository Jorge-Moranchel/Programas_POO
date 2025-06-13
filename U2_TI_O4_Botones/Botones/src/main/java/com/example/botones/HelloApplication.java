package com.example.botones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label label1 = new Label("label 1");
        Label label2 = new Label("label 2");

        Button button1 = new Button("Aceptar");
        Button button2 = new Button("Cancelar");


        button1.setOnAction(e -> label1.setText("Aceptado"));
        button2.setOnAction(e -> label1.setText("Cancelar"));

        HBox hbox = new HBox(20, label1, label2, button1, button2);

        Scene scene = new Scene(hbox, 300, 100);
        stage.setTitle("Hello World");
        //Image image = new Image(getClass().getResourceAsStream("/Image/icons8-mando-100.png"));
        //stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}