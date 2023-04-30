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
public class Venda {
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    
    public Venda(Cliente cliente) {
        this.cliente = cliente;
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
    //Herança;
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    
}
