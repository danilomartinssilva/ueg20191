/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.br.ensaio0810;

/**
 *
 * @author danilo
 */
public class MathApplication {
    
    private CalculadoraService calcService;
    
    public void setCalculadoraService (CalculadoraService calcService){
        this.calcService = calcService;
    }
    
    public int add (int x, int y){
        return this.calcService.add(x, y);
    }
    public int subtract (int x, int y){
        return this.calcService.subtract(x, y);
    }
    public int multiply (int x, int y){
        return this.calcService.multiply(x, y);
    }
    public int divide (int x, int y){
        return this.calcService.divide(x, y);
    }
    
}
