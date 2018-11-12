/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import entidades.Categoria;
import entidades.Produto;

//Classes necessárias para Teste
import org.junit.Test;
import org.junit.Assert;


/**
 *
 * @author danilo
 */
public class GerenciarProduto {
    /*
    public static void main (String args[]){
        Categoria categoria = new Categoria();
        categoria.setCode("CA001");
        categoria.setNome("Informática");
        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setDescricao("Teclado modelo ABNT2");
        produto.setCategoria(categoria);
        produto.setPreco(10.99);
        System.out.println(produto);
        
        
    }*/
    public void teste (){
        Categoria categoria = new Categoria();
        categoria.setCode("CA001");
        categoria.setNome("Informática");
        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setDescricao("Teclado modelo ABNT2");
        produto.setCategoria(categoria);
        produto.setPreco(10.99);
        
     
        
        
    }
    
}
