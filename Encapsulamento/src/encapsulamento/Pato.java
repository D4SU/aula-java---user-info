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
public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Quack-Quack!";
    }

    @Override
    public String comer() {
        return "O Pato come pão!";
    }
    
}
