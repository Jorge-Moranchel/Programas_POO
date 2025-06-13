package com.example.login;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblTipo = new Label("Tipo");
        ObservableList<String> tipos = FXCollections.observableArrayList("estudiante", "profesor", "admin");
        ComboBox<String> cbTipo = new ComboBox<>(tipos);
        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label();

    }

    public static void main(String[] args) {
        launch();
    }
}