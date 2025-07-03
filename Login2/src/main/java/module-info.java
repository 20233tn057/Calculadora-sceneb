module mx.edu.utez.login2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.login2 to javafx.fxml;
    exports mx.edu.utez.login2;
}