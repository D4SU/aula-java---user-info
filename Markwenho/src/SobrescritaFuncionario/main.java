/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrescritaFuncionario;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        //Criando os objetos Motoboy
        Motoboy ifood = new Motoboy("EQC - 8821", "Lucas Wenshester", "734.562.896-09", "22.671.477-2", Genero.MASCULINO, 1750.80, LocalDate.of(1970, Month.JANUARY, 21), LocalDate.of(2014, Month.SEPTEMBER, 11));
        //Criando os objetos Gerente
        Gerente gerenteNegocios = new Gerente(Bonificacao.GERENTE, "Manuela Mendes", "123.456.789-098", "31.894.331-7", Genero.FEMININO, 4579.43, LocalDate.of(2003, Month.MAY, 5), LocalDate.of(2019, Month.JULY, 5));
        //Criando os objetos Diretor
        Diretor diretorExecutivo = new Diretor(Bonificacao.DIRETOR, "Jessica Peixoto", "098.765.432-103", "45.871.985-4", Genero.FEMININO, 6400.90, LocalDate.of(1992, Month.APRIL, 16), LocalDate.of(2020, Month.MAY, 29));
        
        //Exibindo os resultados
        System.out.println("As informações de Motoboy são: ");
        System.out.println("////////////////");
        System.out.println(ifood.toString());
        System.out.println("////////////////");
        System.out.println("As informações de Gerente são: ");
        System.out.println(gerenteNegocios.toString());
        System.out.println("////////////////");
        System.out.println("As informações de Diretor são: ");
        System.out.println("/////////////////");
        System.out.println(diretorExecutivo.toString());
     
        
        
            
        
        
        
    }
    
}
