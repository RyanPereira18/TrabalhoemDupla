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
public interface Operacao {
    public static abstract class Produto implements Operacao{
        private String nome;
        private String Descricao;
        private String Codigo;
        private String Categoria;
        private Double preco;
        private Fornecedor fornecedor;
        private Estoque estoque;
    }
    
    //@Override
    //public void realizarOperacao(){
    
        
        //System.out.println("Realizando Operação para Produto");
}
    

