/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statics;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Letícia", LocalDate.of(1990, Month.JULY, 12), 3450.80);
        
        //Exibindo resultado
        System.out.println("Dados do usuário(a)");
        System.out.println("");
        System.out.println(pessoa.toString());
        
        
        
    }
    
    
    
}
