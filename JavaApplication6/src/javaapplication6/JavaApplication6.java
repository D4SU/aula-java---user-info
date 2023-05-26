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
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(57, "Maria Luiza", 1455.80, 19, Genero.FEMININO, Setor.VENDAS);
        
        
        System.out.println("As informaÃ§Ãµes dos funcionários são:");
        System.out.println("////////////////");
        
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("NÃºmero de identificação: "+funcionario.getId());
        System.out.println("SalÃ¡rio: R$"+funcionario.getSalario());
        System.out.println("Idade: "+funcionario.getIdade());
        System.out.println("Gênero: "+funcionario.getGenero().getTexto());
         System.out.println("Gênero com Caracteres: "+);
        System.out.println("Setor: "+funcionario.getSetor());
        
    }
    
}
