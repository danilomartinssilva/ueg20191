/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidaula04;

/**
 *
 * @author danilo
 */
public class Drone implements Acoes {
    private boolean radioLigado;
    private boolean motorLigado;
    private boolean cameraLigada;
    
    public boolean isCameraLigada(){
        return this.cameraLigada;
    }
    public boolean isRadioLigado(){
        return this.radioLigado;
    }
    public boolean isMotorLigado(){
        return this.motorLigado;
    }
    
    @Override
    public void ligarRadio(){
        throw new UnsupportedOperationException("Não possui rádio");
    }
    
    @Override
    public void desligarRadio(){
        throw new UnsupportedOperationException("Não possui rádio");
    }
    
    @Override
    public void ligarMotor(){
        this.motorLigado = true;
    }
    
    @Override
    public void desligarMotor(){
        this.motorLigado = false;
    }
  

    @Override
    public void ligarCamara() {
        this.cameraLigada = true;
    }

    @Override
    public void desligarCamara() {
        this.cameraLigada = false;
    }
    
    
}
