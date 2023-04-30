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
public class LojaEletrodomestico {
     public static void main(String[] args) {
         Fornecedor fornecedor1 = new Fornecedor("Fornecedor 1", "12345678901234");
         ProdutoEletrodomestico produto1 = new ProdutoEletrodomestico("Geladeira", 2000.0, fornecedor1, 300);
     }
}
