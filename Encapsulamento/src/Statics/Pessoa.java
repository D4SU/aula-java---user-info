/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statics;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    //Atribuindo valor ao atributo e especificando seu tipo da variável
    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    
    //Construct

    public Pessoa(String nome, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //method toString()

    @Override
    public String toString() {
        return "\n Nome: " + nome + 
                "\n Data de Nascimento: " + Util.formatarData(dataNascimento) + 
                "\n Salário: " + Util.formatarMonetario(salario);
    }
    
    
}
