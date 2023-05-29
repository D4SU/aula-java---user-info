/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaFuncionario;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        //Object primeiroMotoboy
        Motoboy primeiroMotoboy = new Motoboy("43222", "Felipe Andrade", "76545567", "89776", 1560.70);
        
        //Object civilEngenheiro
        Engenheiro civilEngenheiro = new Engenheiro("crea 123", "Marcela", "123556778", "23234455", 5600.76);
        
        //Object ortopediaMedico
        Medico ortopediaMedico = new Medico("crm 333", "Maria Clara", "22255678533", "4562322121", 4060.70);
        
        //Saída dos dados 
        System.out.println("As informações do Motoboy são: ");
        System.out.println("");
        System.out.println(primeiroMotoboy.toString());
        System.out.println("");
        System.out.println("As informações do Engenheiro são: ");
        System.out.println("");
        System.out.println(civilEngenheiro.toString());
        System.out.println("");
        System.out.println("As informações do Médico são: ");
        System.out.println("");
        System.out.println(ortopediaMedico.toString());
        
        
    }
    
}
