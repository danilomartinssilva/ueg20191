/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semStrategy;

/**
 *
 * @author danilo
 */
public class Start {
    public static void main(String args[]){
    Frete f = new Frete(TipoFrete.NORMAL);
    System.out.println(f.CalcularFrete(250));
    Frete fsedex = new Frete(TipoFrete.SEDEX);
    System.out.println(fsedex.CalcularFrete(250));
    
        
    }
    
    
}
