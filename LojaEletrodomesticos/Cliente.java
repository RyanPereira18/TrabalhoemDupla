/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaEletrodomesticos;

import java.util.List;

/**
 *
 * @author lucyv
 */
public class Cliente {
    private String  nome;
    private String cidade; 
    private String email; 
    private String endereco;
    private int idade;
    private long cpf;
    private long telefone;
    private List <Venda> comprasRealizadas;
    
    //Construtor
    public Cliente(String nome, String cidade, String email, String endereco, int idade, long cpf, long telefone){
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }   
    
}
