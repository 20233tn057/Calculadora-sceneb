import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TextField txtNum1 = new TextField();
        txtNum1.setPromptText("Número 1");

        TextField txtNum2 = new TextField();
        txtNum2.setPromptText("Número 2");

        Label lblResultado = new Label("Resultado");

        Button btnSumar = new Button("Sumar");
        Button btnRestar = new Button("Restar");
        Button btnMultiplicar = new Button("Multiplicar");
        Button btnDividir = new Button("Dividir");

        btnSumar.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("El resultado es: " + (n1 + n2));
        });

        btnRestar.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("El resultado es: " + (n1 - n2));
        });

        btnMultiplicar.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("El resultado es: " + (n1 * n2));
        });

        btnDividir.setOnAction(e -> {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            if (n2 != 0) {
                lblResultado.setText("El resultado es: " + (n1 / n2));
            } else {
                lblResultado.setText("Error: División por cero");
            }
        });

        VBox panel = new VBox(10, txtNum1, txtNum2, btnSumar, btnRestar, btnMultiplicar, btnDividir, lblResultado);
        panel.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene escena = new Scene(panel, 300, 350);
        stage.setTitle("Calculadora");
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
