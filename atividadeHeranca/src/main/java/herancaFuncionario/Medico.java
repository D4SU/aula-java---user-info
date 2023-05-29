/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaFuncionario;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
    
    //Declaração dos atributos private do tipo String
    private String crm;
    
    //Construct

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    //Getter and Setter
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    //method toString()

    @Override
    public String toString() {
        return super.toString() +
                "\n crm=" + crm;
    }
    
    
}
