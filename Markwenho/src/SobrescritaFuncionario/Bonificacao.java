    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrescritaFuncionario;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    
    GERENTE(0.2),
    DIRETOR(0.4);
    
    //tipo da variável
    protected double valor;
    
    //Construct

    private Bonificacao(double valor) {
        this.valor = valor;
    }
    
    //Getter

    public double getValor() {
        return valor;
    }
    
    
}
