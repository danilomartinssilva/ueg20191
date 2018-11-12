/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author danilo
 */
public class Agenda implements BancoDeDados {
    
    @Override    
    public void conexaoBd(String d,String senha
            ,String db,Integer porta){
        
    }
    
    @Override
    public void read(){
        System.out.println("O método de "
                + "leitura está implementado");
    }   
    @Override
    public void update(){
        System.out.println("O método de "
                + "update está implementado");
    }
    public void delete(){
        System.out.println("O método de "
                + "delete está implementado");
    }
    @Override
    public void insert(){
        System.out.println("O método de "
                + "leitura está implementado");
    }
    @Override
   public boolean statusConexao(){
       return 1>2;
   }
    
   
   
}
