/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaFuncionario;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario {
    
    //Criando atributos do tipo String como private
    
    private String crea;
    
    //Constructor

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    
    //Getter and Setter

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n crea=" + crea;
    }
    
    
}
