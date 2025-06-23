module mx.edu.utez.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.demo2 to javafx.fxml;
    exports mx.edu.utez.demo2;
}