/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F'),
    NAO_BINARIO("Não-Binário", 'NB');
    
    private final String texto;
    private final char character;

    private Genero(String texto, char character) {
        this.texto = texto;
        this.character = character;
    }
    

    
}
