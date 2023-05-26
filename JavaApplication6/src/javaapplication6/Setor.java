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
public enum Setor {
   FINANCEIRO("Financeiro"),
   RECURSOS_HUMANOS("RH - (Recursos Humanos)"),
   VENDAS("Vendas"),
   MARKETING("Marketing");
   
   private String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   
    
}
