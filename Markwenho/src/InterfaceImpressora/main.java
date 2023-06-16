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
public class main {
    public static void main(String[] args) {
        ImpressoraLocal impressoraLocal = new ImpressoraLocal();
        
        impressoraLocal.instalar(new HP());
        
        impressoraLocal.imprimir();
    }
    
}
