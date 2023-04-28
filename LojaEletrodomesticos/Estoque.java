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
public class Estoque {
    
    private int quantidade;
    private String UnidadeMedia;
    private List <Produto> produtoEstoque;
    
    //construtor
    public Estoque(int quantidade, String UnidadeMedia){
        this.quantidade = quantidade;
        this.UnidadeMedia = UnidadeMedia;
    }
    
    //Getters e setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedia() {
        return UnidadeMedia;
    }

    public void setUnidademedia(String UnidadeMedia) {
        this.UnidadeMedia = UnidadeMedia;
    }
    
    
}
