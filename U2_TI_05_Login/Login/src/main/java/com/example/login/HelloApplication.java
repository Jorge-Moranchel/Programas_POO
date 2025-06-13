package com.example.login;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
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
        ObservableList<String> tipos = FXCollections.observableArrayList("Estudiante", "Profesor", "Adminzzz");
        ComboBox<String> cbTipo = new ComboBox<>(tipos);
        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label();

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblEdad, 0, 2);
        root.add(tfEdad, 1, 2);
        root.add(lblTipo, 0, 3);
        root.add(cbTipo, 1, 3);
        root.add(btnCrear, 0, 4);
        root.add(btnReset, 1, 4);
        root.add(lblResultado, 0, 5, 2, 1);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();
            String tipo = cbTipo.getSelectionModel().getSelectedItem();

            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || tipo == null) {
                lblResultado.setText("Por favor informe todos los campos");
                lblResultado.setStyle("-fx-background-color: #936060;");
                root.setStyle("-fx-background-color: #6bc9e3;");
            } else {
                lblResultado.setText("Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + " | Tipo: " + tipo);
                root.setStyle("-fx-background-color: #00ff00;");
                lblResultado.setStyle("-fx-background-color: #add8e6;");

                tfNombre.setStyle("-fx-control-inner-background: #9fd5ce;");
                tfApellido.setStyle("-fx-control-inner-background: #9fd5ce;");
                tfEdad.setStyle("-fx-control-inner-background: #9fd5ce;");
            }
        });

        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbTipo.getSelectionModel().clearSelection();
            lblResultado.setText("");
            root.setStyle("");
            lblResultado.setStyle("");
            tfNombre.setStyle("");
            tfApellido.setStyle("");
            tfEdad.setStyle("");
        });
        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Login");
        Image imagen = new Image(getClass().getResourceAsStream("/Imagenes/mando.png"));
        stage.getIcons().add(imagen);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}