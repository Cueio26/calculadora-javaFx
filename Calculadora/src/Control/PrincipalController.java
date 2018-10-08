/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Historico;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Historico historico1 = new Historico();
         historico1.setPrimeiroValor(txtNumero1.getText());
        historico1.setSegundoValor(txtNumero2.getText());
        historico1.setResultado(txtResultado.getText());
        historico1.setOperador(btnSomar.getText());
        
        
        em.getTransaction().begin();
        em.persist(historico1);
        em.getTransaction().commit();
        Stage stage = (Stage) btnSomar.getScene().getWindow();
        
    }
     @FXML
     private void Dividir (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = (numl) / (num2);
        
        txtResultado.setText(result.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Historico historico1 = new Historico();
         historico1.setPrimeiroValor(txtNumero1.getText());
        historico1.setSegundoValor(txtNumero2.getText());
        historico1.setResultado(txtResultado.getText());
        historico1.setOperador(btnDividir.getText());
        
        
        em.getTransaction().begin();
        em.persist(historico1);
        em.getTransaction().commit();
        Stage stage = (Stage) btnDividir.getScene().getWindow();
        
    }
      @FXML
     private void Subtrair (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = (numl) - (num2);
        
        txtResultado.setText(result.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Historico historico1 = new Historico();
         historico1.setPrimeiroValor(txtNumero1.getText());
        historico1.setSegundoValor(txtNumero2.getText());
        historico1.setResultado(txtResultado.getText());
        historico1.setOperador(btnSubtrair.getText());
        
        
        em.getTransaction().begin();
        em.persist(historico1);
        em.getTransaction().commit();
        Stage stage = (Stage) btnSubtrair.getScene().getWindow();
        
    }
      @FXML
     private void Multiplicar (ActionEvent event) {
        Double numl = Double.parseDouble(txtNumero1.getText());
        Double result;
        
        Double num2 = Double.parseDouble(txtNumero2.getText());
        result = numl * num2;
        
        txtResultado.setText(result.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Historico historico1 = new Historico();
         historico1.setPrimeiroValor(txtNumero1.getText());
        historico1.setSegundoValor(txtNumero2.getText());
        historico1.setResultado(txtResultado.getText());
        historico1.setOperador(btnMultiplicar.getText());
        
        
        em.getTransaction().begin();
        em.persist(historico1);
        em.getTransaction().commit();
        Stage stage = (Stage) btnMultiplicar.getScene().getWindow();
        
    }
     
    @FXML
    private void historico(ActionEvent event) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/Views/Ver.fxml"));
        
        Scene scene = new Scene(root);
        
        
    }
    

    
}
