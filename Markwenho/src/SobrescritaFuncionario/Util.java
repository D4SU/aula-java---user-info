/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrescritaFuncionario;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public class Util {
    //method static formatarData
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(data);
    }
    
    //method formatarMonetario
    public static String formatarMonetario(double valor) {
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
    
}
