package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    private Label resultado;
    private long numero1 = 0;
    private String operacion = "";
    private boolean inicio = true;
    private Modelo modelo = new Modelo();

    public void procesarNumeros(ActionEvent actionEvent){
        if (inicio){
            resultado.setText("");
            inicio = false;
        }
        String value = ((Button)actionEvent.getSource()).getText();
        resultado.setText(resultado.getText()+value);
        System.out.println("Procesando numeros");
    }
    public void procesarOperaciones(ActionEvent actionEvent){
        String value = ((Button)actionEvent.getSource()).getText();
        if(!value.equals("=")){
            if (!operacion.isEmpty())
                return;
            operacion = value;
            numero1 = Long.parseLong(resultado.getText());
            resultado.setText("");
        }
        else {
            if (operacion.isEmpty()) return;
            long numero2 = Long.parseLong(resultado.getText());
            float salida = modelo.calcular(numero1, numero2, operacion);
            resultado.setText(String.valueOf(salida));
            operacion = "";
            inicio = true;
        }
        System.out.println("Procesando operaciones");
    }
}
