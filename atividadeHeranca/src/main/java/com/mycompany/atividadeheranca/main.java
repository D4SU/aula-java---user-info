//Packages
package com.mycompany.atividadeheranca;

import java.time.LocalDate;
import java.time.Month;


public class main {

    public static void main(String[] args) {
        
        Fisica pessoaFisica = new Fisica("65432144466", "3245667", LocalDate.of(1990, Month.MARCH, 30), "Julia", "723344-9877");
        
        //Object pessoaJuridica
        Juridica pessoaJuridica = new Juridica("45364433", "Estado da Bahia", "Julia", "71 98754-3322");
        
        System.out.println(pessoaFisica.toString());
        System.out.println("");
        System.out.println(pessoaJuridica);
        
    }
}

