/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Aluno
 */
public enum uf {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private final String text;
    private final String sigla;

    //Constructor

    private uf(String text, String sigla) {
        this.text = text;
        this.sigla = sigla;
    }

    public String getText() {
        return text;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
}
