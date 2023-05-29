/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaFuncionario;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {
        //Criando atributos do tipo String como private
        
    private String cnh;
    
    //Construct

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    //Getter and Setter

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    

    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n cnh=" + cnh;
    }
    
    
    
}
