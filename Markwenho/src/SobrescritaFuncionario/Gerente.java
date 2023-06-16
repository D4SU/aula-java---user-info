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
public class Gerente extends CargoDeConfianca implements Autenticavel {
//Atributos e Variáveis (nada)
    
    
     //Construct
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }
    
    //method getSalarioFinal

    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * bonificacao.valor);
    }
    
    
    
    
}
