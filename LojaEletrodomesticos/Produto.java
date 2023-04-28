/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaEletrodomesticos;

/**
 *
 * @author lucyv
 */
public class Produto {
    private String nome;
    private String Descricao;
    private String Codigo;
    private String Categoria;
    private Double preco;
    private Fornecedor fornecedor;
    private Estoque estoque;
    
    //Construtor
    public Produto(String nome, String Descricao, String Codigo, String Categoria, double preco){
        this.nome = nome;
        this.Descricao = Descricao;
        this.Codigo = Codigo;
        this.Categoria = Categoria;
        this.preco = preco;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
