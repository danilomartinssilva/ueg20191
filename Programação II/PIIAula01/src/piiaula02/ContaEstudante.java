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
public class ContaEstudante  extends ContaCorrente{
    private double milhas;
    
    
    @Override
    public void depositar(double valor){
        this.milhas+=valor;
    }
    @Override
    public void sacar(double valor) throws Exception{
        if(this.milhas>=valor){
            this.milhas-=valor;
        }else{            
            throw new Exception("Você não possui saldo suficiente");
        }
    }
    
    
    
    public void rendimentoAluno() throws MinhaException{
        
       throw new MinhaException("Neste tipo de conta não há rendimento");
    }
    
    
}
