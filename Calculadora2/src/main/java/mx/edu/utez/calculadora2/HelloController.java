package mx.edu.utez.calculadora2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Label lblResultado;

    @FXML
    private Button btnSumar;

    @FXML
    private Button btnRestar;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Button btnDividir;

    @FXML
    public void initialize() {
        btnSumar.setOnAction(e -> operar("+"));
        btnRestar.setOnAction(e -> operar("-"));
        btnMultiplicar.setOnAction(e -> operar("*"));
        btnDividir.setOnAction(e -> operar("/"));
    }

    private void operar(String operacion) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            double resultado = 0;

            switch (operacion) {
                case "+":
                    resultado = n1 + n2;
                    break;
                case "-":
                    resultado = n1 - n2;
                    break;
                case "*":
                    resultado = n1 * n2;
                    break;
                case "/":
                    if (n2 != 0) {
                        resultado = n1 / n2;
                    } else {
                        lblResultado.setText("Error: División por cero");
                        return;
                    }
                    break;
            }

            lblResultado.setText("El resultado es: " + resultado);

        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa números válidos.");
        }
    }
}

