/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Aluno
 */
public class Soma implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return (a + b);
    }
    
}