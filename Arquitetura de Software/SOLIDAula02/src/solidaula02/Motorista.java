/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidaula02;

/**
 *
 * @author danilo
 */
public class Motorista  extends GerenciarSalario{
    private double salario;

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
   

    @Override
    public double calcularSalario() {
        return this.getSalario()+(this.getSalario() * 0.20);        
    }
    
}
