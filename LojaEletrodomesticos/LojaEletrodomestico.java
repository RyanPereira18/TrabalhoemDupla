/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaEletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author lucyv
 */
public class LojaEletrodomestico {
     public static void main(String[]args){
         Scanner entrada = new Scanner(System.in);
         
      Produto meuProduto = new Produto();
      System.out.println("Digite o Nome do Produto:");
      meuProduto.setNome(entrada.nextLine());
      System.out.println("Digite a Descricao do Produto:");
      meuProduto.setDescricao(entrada.nextLine());
      System.out.println("Digite a Codigo do Produto:");
      meuProduto.setCodigo(entrada.nextLine());
      System.out.println("Digite o Categoria do Produto:");
      meuProduto.setCategoria(entrada.nextLine());
      System.out.println("Digite o Preco do Produto:");
      meuProduto.setPreco(entrada.nextDouble());
      
      //Inserindo o Preço com Desconto no Produto
      double preco = 100;
      double desconto =0.05; // 10% de desconto
      double precoComDesconto = preco * (1 - (desconto / 100));
      System.out.println("Preço com desconto: R$" + precoComDesconto);
      
      //Quantidade de Estoque 
      int quantidade = 50;
      String quantidadeMedia;
      
     } 
       
}
