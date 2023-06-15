/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Aluno
 */
public class Galo implements Animal {

    @Override
    public String emitirSom() {
        return "Cocó-ri-có!";
    }

    @Override
    public String comer() {
        return "O Galo come milho!";
    }
    
}
