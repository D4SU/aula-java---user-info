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
public class main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtração subtração = new Subtração();
        Divisão divisão = new Divisão();
        Multiplicação multiplicação = new Multiplicação();
        
        //Digitando o valor
        System.out.println("O resultado da soma é: " +soma.calcular(5, 4));
        System.out.println("O resultado da subtração é: " +subtração.calcular(10, 5));
        System.out.println("O resultado da divisão é: "+divisão.calcular(10, 3));
        System.out.println("O resultado da multiplicação é: " +multiplicação.calcular(10, 2));
        
        
        
    }
    
}
