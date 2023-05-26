/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "204", "Apartamento 708", "45876-003", "Niterói", uf.RIO_DE_JANEIRO);
        Pessoa pessoa = new Pessoa ("Felicia", 57, LocalDate.of(2004, Month.JULY, 13), "(71) 3245-7766", "feliciadades@gmail.com", Genero.FEMININO, endereco);
        
        
        System.out.println("As informações do(a) usuário(a) são:");
        System.out.println("");
        System.out.println("////////////");
        System.out.println("");
        System.out.println("Usuário: "+pessoa.getNome());
        System.out.println("N° identificador: "+pessoa.getId());
        System.out.println("Idade: "+pessoa.getDataNascimento());
        System.out.println("N° Telefone: "+pessoa.getTelefone());
        System.out.println("E-mail: "+pessoa.getEmail());
        System.out.println("Gênero: "+pessoa.getGenero().getTexto());
        System.out.println("");
        System.out.println("////////////");
        System.out.println("");
        System.out.println("Informações de endereço:");
        System.out.println("Logradouro: "+pessoa.getEndereco().getLogradouro());
        System.out.println("Número: "+pessoa.getEndereco().getNumero());
        System.out.println("Complemento: "+pessoa.getEndereco().getComplemento());
        System.out.println("CEP: "+pessoa.getEndereco().getCep());
        System.out.println("Cidade: "+pessoa.getEndereco().getCidade());
        System.out.println("Unidade Federativa(Estado): "+pessoa.getEndereco().getUnidadeFederativa().getSigla());

        
    }
}
