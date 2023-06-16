/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceImpressora;

/**
 *
 * @author Aluno
 */
public class HP implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("-- Impressora HP -- ");
        System.out.println("Preparando toner...");
        System.out.println("Imprimindo...");
    }
    
}
