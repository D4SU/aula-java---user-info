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
public class Diretor extends CargoDeConfianca implements Autenticavel {
    
    //Criando atributos e especificando as variáveis
    private final double premio = 0.1;
    
    //Construct

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }
    
    //method getSalarioFinal

    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * bonificacao.valor + salarioBase * premio);
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n Valor do Prêmio: " + premio;
    }
    
    //Getter and Setter

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
    
    
    
}
