/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 54902797291
 */
public class PrincipalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSomar;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btHistorico;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
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
     
    @FXML
    private void historico(ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Caixa.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),670,444);
    Stage stage = new Stage();
    stage.setTitle("Caixa");
    stage.setScene(scene);
    stage.show();
    }
    

    
}
