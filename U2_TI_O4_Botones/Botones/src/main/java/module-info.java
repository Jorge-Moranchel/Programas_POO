module com.example.botones {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.botones to javafx.fxml;
    exports com.example.botones;
}