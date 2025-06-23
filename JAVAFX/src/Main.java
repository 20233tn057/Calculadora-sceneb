import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setSpacing(10);

        Button btn = new Button("¡Hola, JavaFX!");
        btn.setOnAction(e -> {
            // Mostrar un mensaje de alerta
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mensaje");
            alert.setHeaderText("Saludos");
            alert.setContentText("¡Hola, este es un mensaje en JavaFX!");
            alert.showAndWait();
        });

        root.getChildren().add(btn); // Agregamos el botón al panel

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Ventana JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
