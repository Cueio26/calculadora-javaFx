/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.PrincipalController;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import calculadora.Historico;
import calculadora.Historico;
import java.security.Principal;

/**
 * FXML Controller class
 *
 * @author 54902797291
 */
public class VerController implements Initializable {

    @FXML
    private ComboBox<?> cbCalculadora;
    @FXML
    private TableView<?> tbCalculadora;
    @FXML
    private Button btnExcluir;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listar();
    }    

     public void listar(){
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager  em = emf.createEntityManager();
    
        Query query = em.createQuery("SELECT a FROM Historico a");

        List<Historico> historico = query.getResultList();

        ObservableList oHistorico = FXCollections.observableArrayList(historico);

        tbCalculadora.setItems(oHistorico);
        cbCalculadora.setItems(oHistorico);
    }
     
    @FXML
    private void excluir(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager  em = emf.createEntityManager();
        Historico historico = (Historico) tbCalculadora.getSelectionModel().getSelectedItem();
        Query query = em.createQuery("SELECT a FROM Historico a WHERE a.id = :id");
        query.setParameter("id",historico.getId());
        
        Historico c = (Historico) query.getSingleResult();
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        listar();
  
    }
    
}
