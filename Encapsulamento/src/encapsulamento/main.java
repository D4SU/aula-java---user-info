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
public class main {
    public static void main(String[] args) {
        //Instanciando o objeto cachorro
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        //Exibindo resultado
        System.out.println("Cachorro: "+ cachorro.emitirSom());
        System.out.println("O que ele come? " + cachorro.comer());
        System.out.println("");
        System.out.println("Gato: "+ gato.emitirSom());
        System.out.println("O que ele come? " + gato.comer());
        System.out.println("");
        System.out.println("Galo: "+ galo.emitirSom());
        System.out.println("O que ele come? "+ galo.comer());
        System.out.println("");
        System.out.println("Pato: " +pato.emitirSom());
        System.out.println("O que ele come? " + pato.comer());
        
    }
    
}
