/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucao;

/**
 *
 * @author danilo
 */
public class Botao {
    //Botao liga, funciona agora: lampada, alarme, motor
    private Dispositivo dispositivo;
    public void acionar(boolean ligar){
        if(ligar){
            dispositivo.ligar();
            System.out.println("teste");
        }
        else{
            dispositivo.desligar();
        }
    }
    public Dispositivo getDispositivo(){
        return dispositivo;
    }
    public void setDispositivo(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    
}
