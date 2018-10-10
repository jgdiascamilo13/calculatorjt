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
    
}
