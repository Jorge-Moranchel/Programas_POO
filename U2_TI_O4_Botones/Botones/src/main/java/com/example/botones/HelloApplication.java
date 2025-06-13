package com.example.botones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Label label1 = new Label("label 1");
        Label label2 = new Label("label 2");

        Button button1 = new Button("Aceptar");
        Button button2 = new Button("Cancelar");

        button1.setOnAction(e -> label1.setText("Aceptado"));
        button2.setOnAction(e -> label1.setText("Cancelado"));

        HBox labelBox = new HBox(10, label1, label2);
        labelBox.setAlignment(Pos.CENTER);

        HBox buttonBox = new HBox(20, button1, button2);
        buttonBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, labelBox, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Interfaz xd");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
