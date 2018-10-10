/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;
import br.edu.ifro.model.calculadora;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 92718540206
 */
public class CalculatorjtController implements Initializable {
    
    private Label label;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btnigual;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btndividir;
    @FXML
    private JFXButton btnmultiplicar;
    @FXML
    private JFXButton btnsubtrair;
    @FXML
    private JFXButton btnsomar;
    @FXML
    private JFXButton btnlimpar;
    @FXML
    private JFXTextField txtDisplay;
    @FXML
    private JFXButton btnhist;
    
    private int operador1, operador2, resultado;
    private String operador;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void efetuar(ActionEvent event) {
        operador2 = Integer.parseInt(txtDisplay.getText());
        if(!txtDisplay.getText().equals("")){
                operador2 = Integer.parseInt(txtDisplay.getText());
                switch(operador){
                    case "+" : resultado = operador1 + operador2;
                    break;
                    case "-" : resultado = operador1 - operador2;
                    break;
                    case "*" : resultado = operador1 * operador2;
                    break;
                    case "/" : resultado = operador1 / operador2;
                    break;
                }
                txtDisplay.setText("" + resultado);
        }
        else{
           txtDisplay.setText(""); 
        }
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();

        calculadora cal = new calculadora();
        cal.setPrimeiroValor(operador1);
        cal.setSegundoValor(operador2);
        cal.setResultado(resultado);
        cal.setOperador(operador);
        
        em.getTransaction().begin();
        em.persist(cal);
        em.getTransaction().commit(); 
           
    }
    

    @FXML
    private void dividir(ActionEvent event) {
        operador1 = Integer.parseInt(txtDisplay.getText());
        operador = "/";
        if(!txtDisplay.getText().equals("")){
            operador1 = Integer.parseInt(txtDisplay.getText());
            operador = "/";
            txtDisplay.setText("");
            }
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        operador1 = Integer.parseInt(txtDisplay.getText());
        operador = "*";
        if(!txtDisplay.getText().equals("")){
            operador1 = Integer.parseInt(txtDisplay.getText());
            operador = "*";
            txtDisplay.setText("");
            }
    }

    @FXML
    private void subtrair(ActionEvent event) {
        operador1 = Integer.parseInt(txtDisplay.getText());
        operador = "-";
        
        if(!txtDisplay.getText().equals("")){
            operador1 = Integer.parseInt(txtDisplay.getText());
            operador = "-";
            txtDisplay.setText("");
            }
    }

    @FXML
    private void somar(ActionEvent event) {
        operador1 = Integer.parseInt(txtDisplay.getText());
        operador = "+";
        
        if(!txtDisplay.getText().equals("")){
            operador1 = Integer.parseInt(txtDisplay.getText());
            operador = "+";
            txtDisplay.setText("");
            }
    }

    @FXML
    private void limpar(ActionEvent event) {
        txtDisplay.setText("");
    }

    @FXML
    private void botao7(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 7);
    }

    @FXML
    private void botao9(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 9);
    }

    @FXML
    private void botao8(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 8);
    }

    @FXML
    private void botao5(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 5);
    }

    @FXML
    private void botao6(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 6);
    }

    @FXML
    private void botao4(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 4);
    }

    @FXML
    private void botao2(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 2);
    }

    @FXML
    private void botao3(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 3);
    }

    @FXML
    private void botao1(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 1);
    }

    @FXML
    private void botao0(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 0);
    }

    @FXML
    private void mostrarHistorico(ActionEvent event) {
    }
    
}