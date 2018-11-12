/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula02;

/**
 *
 * @author danilo
 */
public class ReferenciaNula {
    public String cadastraPessoa(){
        //Pessoa p = new Pessoa();
        try{
            Pessoa p = null;        
            return p.getNome();
        }catch(NullPointerException e){
            System.out.println("A referência da classe é nula: "+e.getMessage());
         return null;
        }
        
    }
}
