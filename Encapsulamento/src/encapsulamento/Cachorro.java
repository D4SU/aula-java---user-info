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
public class Cachorro implements Animal {

    @Override // Pode mudar o conteúdo
    public String emitirSom() {
        return "Au-Au!";
    }

    @Override
    public String comer() {
        return "O Cachorro pode comer ração Pedigree!";
    }
    
}
