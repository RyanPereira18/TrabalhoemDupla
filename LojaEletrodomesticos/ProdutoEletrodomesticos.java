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
public class ProdutoEletrodomesticos extends Produto{
    
    //Polimorfismo;
    private int potencia;
    
    public ProdutoEletrodomesticos(String nome, double preco, Fornecedor fornecedor, int potencia) {
        super(nome, preco, fornecedor);
        this.potencia = potencia;
    }
    
    // Métodos get e set para o atributo potencia
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
