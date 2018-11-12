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
public class Botao {
    private Lampada lampada;
    
    public void acionar(boolean ligar){
        if(ligar){
            lampada.ligar();
        }
        else{
            lampada.desligar();
        }
    }    
    public Lampada getLampada(){
        return lampada;
    }
    public void setLampada(Lampada lampada){
        this.lampada = lampada;
    }
   
}
