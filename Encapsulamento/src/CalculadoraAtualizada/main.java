/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraAtualizada;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new OperacaoMatematica();
        
        //Exibindo resultados
        System.out.println("Soma: " +soma.calcular(1, 3));
        System.out.println(soma.calcular(2.5, 4.2));
        System.out.println(soma.calcular("vi", "ram"));
        
    }
    
}
