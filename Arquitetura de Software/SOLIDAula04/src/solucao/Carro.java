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
public class Carro implements AcaoRadio,AcaoMotor {
    
    private boolean radioLigado;
    private boolean motorLigado;
    
    public boolean isRadioLigado(){
        return this.radioLigado;
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
    
    
}

