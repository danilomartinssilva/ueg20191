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
public class InputDialog {
    
    public InputDialog(){
        String nome = JOptionPane.showInputDialog(null,
                "Digite o seu nome" , "Cadastro", 
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(nome);
    }
}
