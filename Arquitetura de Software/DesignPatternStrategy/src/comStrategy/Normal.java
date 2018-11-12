package comStrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Normal implements Frete {
    
    public double calcularPreco(int distancia){
        return distancia * 1.25 + 10;
    }
}
