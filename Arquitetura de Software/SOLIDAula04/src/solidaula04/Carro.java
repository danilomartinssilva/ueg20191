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
public class Carro implements Acoes {
    
    private boolean radioLigado;
    private boolean motorLigado;
    
    public boolean isRadioLigado(){
        return this.radioLigado;
    }
    public boolean isMotorLigado(){
        return this.motorLigado;
    }
    
    @Override
    public void ligarRadio(){
        this.radioLigado = true;
    }
    
    @Override
    public void desligarRadio(){
        this.radioLigado = false;
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
        throw new UnsupportedOperationException("Carro não possui câmera"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desligarCamara() {
        throw new UnsupportedOperationException("Carro não possui câmera"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
