/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author danilo
 */
public class JTFApp {
    public static void main(String args[]){
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(350,250);
        Container cont = frame.getContentPane();
        JTextField tf = new JTextField("Digite aqui:");        
        cont.add(tf,BorderLayout.NORTH);
        frame.setVisible(true);
        
        
    }
    
}
