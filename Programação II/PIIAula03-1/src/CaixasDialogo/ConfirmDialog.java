/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaixasDialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class ConfirmDialog {
    
    public ConfirmDialog(){
      int resposta = JOptionPane.showConfirmDialog(null,
                      " Documento modificado. Salvar alterações");
      //JOption.YES_OPTION(0)== YES
      //JOption.YES_OPTION(1)== NO
      //JOption.YES_OPTION(2)== CANCEL
      System.out.println(resposta);
        
    }
    
}
