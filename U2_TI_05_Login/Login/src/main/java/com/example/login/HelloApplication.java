package com.example.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField txtNombre = new TextField();
        TextField txtApellido = new TextField();
        TextField txtEdad = new TextField();

        ComboBox<String> comboRol = new ComboBox<>();
        comboRol.getItems().addAll("Estudiante", "Profesor", "Admin");

        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
    }

    public static void main(String[] args) {
        launch();
    }
}