/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaEletrodomesticos;

import java.util.ArrayList;


/**
 *
 * @author lucyv
 */
public class Estoque {
    
    private ArrayList<Produto> produtos;
    
    public Estoque() {
        produtos = new ArrayList<Produto>();
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void removerProduto(int index) {
        produtos.remove(index);
    }
    
    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }
}
    
    

