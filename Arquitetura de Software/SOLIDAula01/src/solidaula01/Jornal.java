/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidaula01;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danilo
 */
public class Jornal {
    private List<String> entrada = new ArrayList<>();
    private int count = 0;
    /**
     *  //1 : TEXTO
        //2 : OUTRO TEXTO
     * @param text 
     */
    public void addEntrada (String text){
        
        entrada.add(""+(++this.count)+":"+text );
        
    }
    
    public void removeEntrada(int index){
        entrada.remove(index);
    }
    
    @Override
    public String toString(){
        return String.join(System.lineSeparator(),entrada);
    }
    
  
    
    
    
    
}
