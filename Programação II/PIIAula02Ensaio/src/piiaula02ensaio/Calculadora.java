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
public class Calculadora {
    private double n1,n2;

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double divisao()  {
        double resultado = n1/n2;
        if(resultado>0){
            return resultado;
        }
        else{
            throw new ArithmeticException("Erro");
        }
        
     
    }
    public double divisao1() throws Exception{
         if(this.getN1()==0 || this.getN2()==0){
             throw new Exception("Validacao indevida");
         }
         return this.getN1()/this.getN2();
    }
       public double divisao2() throws MinhasException{
         if(this.getN1()==0 || this.getN2()==0){
             throw new MinhasException();
         }
         return this.getN1()/this.getN2();
    }
}
