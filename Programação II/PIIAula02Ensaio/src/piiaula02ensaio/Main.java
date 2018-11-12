/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula02ensaio;

/**
 *
 * @author danilo
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        double n1 = 2;
        double n2 = 10;
        Calculadora c = new Calculadora();
        c.setN1(n1);
        c.setN2(n2);
       
            System.out.println(c.divisao2());
       }
        catch(MinhasException e){
            System.out.println(e.getMessage());
        }
        
        
        

       
    }
   
}
