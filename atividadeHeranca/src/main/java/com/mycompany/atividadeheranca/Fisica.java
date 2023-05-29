/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeheranca;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa {
   //Criando atributos private do tipo String
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    
    //getIdade()
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    
    //construct

    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    //getter and setter

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    // method toString()

    @Override
    public String toString() {
        return  super.toString() +
                "\n CPF=" + cpf +
                "\n RG=" + rg + 
                "\n Data de Nascimento=" + dataNascimento +
                "\n Idade= " + this.getIdade(); //this = está nesta classe
    }

    
    
    
    
    
    
}
