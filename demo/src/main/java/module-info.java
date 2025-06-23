module mx.edu.utez.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.demo to javafx.fxml;
    exports mx.edu.utez.demo;
}