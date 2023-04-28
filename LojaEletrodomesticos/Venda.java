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
public class Venda {
    private double valorTotal;
    Produto produto;
    private List <Produto> produtosVendidos;
    
    //Construtor
    public Venda(double valorTotal, Produto produto){
        this.valorTotal = valorTotal;
        this.produto = produto;
    }
    //Getters e Setters

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
