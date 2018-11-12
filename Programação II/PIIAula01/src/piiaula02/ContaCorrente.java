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
public class ContaCorrente {
    
    private double valor;
    private double saldo=0;
    
    public void depositar(double valor){
        this.saldo+= valor;
    }
    public void sacar(double valor) throws Exception{
        if(valor<=this.saldo){
            this.saldo-=valor;
        }else{
             throw new Exception("Você não tem saldo suficiente");        
         }
        
    }
    public void rendimento(){
        this.saldo+=this.saldo*0.01;        
    }
    public double saldo(){
        return this.saldo;
    }
    
}
