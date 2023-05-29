/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeheranca;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
       //Criando atributos protected do tipo String

    protected String nome;
    protected String telefone;
    
    //Constructor

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    //method toString()

    @Override
    public String toString() {
        return "\n nome=" + nome
                + "\n telefone=" + telefone;
    }
    
    
    //getter and setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
