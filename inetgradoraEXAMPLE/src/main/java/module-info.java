module mx.edu.utez.inetgradoraexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.inetgradoraexample to javafx.fxml;
    exports mx.edu.utez.inetgradoraexample;
}