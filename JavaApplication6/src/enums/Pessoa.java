/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private int id;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private Genero genero;
    private Endereco endereco;
    
    //Constructor

    public Pessoa(String nome, int id, LocalDate dataNascimento, String telefone, String email, Genero genero, Endereco endereco) {
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.endereco = endereco;
    }
    
    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
