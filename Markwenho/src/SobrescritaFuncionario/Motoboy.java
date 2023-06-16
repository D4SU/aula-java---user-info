/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrescritaFuncionario;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {
    
    //Criando atributos e especificando o tipo das variáveis
    private String placaDaMoto;
    
    //Construct
    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n Número da Placa da Moto: " + placaDaMoto;
    }
    
    //Getter and Setter

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
    
    //method getSalarioFinal()

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    
    
}
