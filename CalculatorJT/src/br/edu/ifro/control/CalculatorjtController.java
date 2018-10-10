/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void efetuar(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }

    @FXML
    private void multiplicar(ActionEvent event) {
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void somar(ActionEvent event) {
    }

    @FXML
    private void limpar(ActionEvent event) {
    }

    @FXML
    private void botao7(ActionEvent event) {
        txtDisplay.setText("" + txtDisplay.getText() + 7);
    }

    @FXML
    private void botao9(ActionEvent event) {
    }

    @FXML
    private void botao8(ActionEvent event) {
    }

    @FXML
    private void botao5(ActionEvent event) {
    }

    @FXML
    private void botao6(ActionEvent event) {
    }

    @FXML
    private void botao4(ActionEvent event) {
    }

    @FXML
    private void botao2(ActionEvent event) {
    }

    @FXML
    private void botao3(ActionEvent event) {
    }

    @FXML
    private void botao1(ActionEvent event) {
    }

    @FXML
    private void botao0(ActionEvent event) {
    }

    @FXML
    private void mostrarHistorico(ActionEvent event) {
    }
    
}
