/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucao;

/**
 *
 * @author danilo
 */
public class ContaEstudante {
    
    private int milhas;
    public void deposita(double valor){
        this.milhas+=(int)valor;
    }
    public int getMilhas(){
        return milhas;
    }
    public void sacar(double valor){
        this.milhas-=(int)valor;
    }
    public void rendimento(){
        throw new RuntimeException("Não pode render");
    }
}
