
import problema.Retangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Quadrado extends Retangulo{
    private double altura;

    public Quadrado(double altura, double largura) {
        super(altura, largura);
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(double altura){
        return this.altura;
    }
    @Override
    public double CalcularArea(){
         return super.CalcularArea();
         
    }
}
