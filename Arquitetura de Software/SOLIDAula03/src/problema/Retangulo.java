/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

/**
 *
 * @author danilo
 */
public class Retangulo {
    private double altura,largura;
    public Retangulo(double altura,double largura){
        this.altura = altura;
        this.largura= largura;
    }
    public double CalcularArea(){
        return this.altura*this.largura;
    }
    
}
