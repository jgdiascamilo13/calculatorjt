/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 00669412295
 */
public class calculadora {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     private Integer id;
     private int primeiroValor, segundoValor, resultado;
     private String operador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(int primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public int getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(int segundoValor) {
        this.segundoValor = segundoValor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
