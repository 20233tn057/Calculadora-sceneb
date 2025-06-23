import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class alerta extends main {
    @Override
    public void start(Stage primaryStage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText("¡Bienvenido!");
        alert.setContentText("Esto es una alerta estilo SweetAlert pero en JavaFX.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
