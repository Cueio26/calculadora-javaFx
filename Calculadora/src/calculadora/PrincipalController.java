/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 54902797291
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1,txtNumero2, txtResultado;
    @FXML
    private Button btnSomar, btnDividir, btnSubtrair, btnMultiplicar;
    
    
    @FXML
    private void Somar(ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = numl + num2;
        
        txtResultado.setText(result.toString());
        
    }
     @FXML
     private void Dividir (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = (numl) / (num2);
        
        txtResultado.setText(result.toString());
        
    }
      @FXML
     private void Subtrair (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = (numl) - (num2);
        
        txtResultado.setText(result.toString());
        
    }
      @FXML
     private void Multiplicar (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = numl * num2;
        
        txtResultado.setText(result.toString());
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
