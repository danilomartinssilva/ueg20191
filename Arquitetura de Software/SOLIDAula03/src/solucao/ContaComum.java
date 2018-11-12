package solucao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class ContaComum  {
    protected double saldo;
    public ContaComum(){
        this.saldo = 0;
    }
    public void deposita(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }
    public void rendimento(){
        this.saldo+= this.saldo *0.01;
    }
    public double getSaldo(){
        return saldo;
    }
}
