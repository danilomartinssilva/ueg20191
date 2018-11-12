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
public class CalcularSalario {
    
    private double salario;
    
    public void salarioFinal( Funcionario f1){
        
        if(f1==Funcionario.OPERADOR){
            this.salario += (this.salario)*0.20;
        }
        if(f1==Funcionario.GERENTE){
            this.salario += (this.salario) * 0.40;
        }
        
    }
    
    
}
