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
public class MessageDialog {
    
    public MessageDialog(){
        JOptionPane.showMessageDialog(null, "Programa instalado",
                "Instalação Concluída",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
