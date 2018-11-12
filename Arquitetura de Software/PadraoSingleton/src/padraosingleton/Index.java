/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraosingleton;


/**
 *
 * @author danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tudo funcionando");
        Produtos singleton = Produtos.getInstance();
        singleton.setNomeProduto("Produto 1");
        System.out.println(singleton.getNomeProduto());
        
        Produtos singleton2 = Produtos.getInstance();       
        singleton2.setNomeProduto("Produto 2");
        System.out.println(singleton2.getNomeProduto());
    }
    
}
