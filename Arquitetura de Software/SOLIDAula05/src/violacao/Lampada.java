/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violacao;

/**
 *
 * @author danilo
 */
public class Lampada {
    
    private boolean estaLigada;
    
    public boolean estaLigada(){
        return this.estaLigada;
    }
    public void ligar(){
        this.estaLigada = true;
    }
    public void desligar(){
        this.estaLigada = false;
    }
}

