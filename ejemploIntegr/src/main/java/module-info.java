module mx.edu.utez.ejemplointegr {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.ejemplointegr to javafx.fxml;
    exports mx.edu.utez.ejemplointegr;
}