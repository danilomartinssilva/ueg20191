/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class ButtonApp {
    public static void main(String args[]){
        JFrame frame = new JFrame("Aplicação");                
        Container cont = frame.getContentPane();
        frame.setSize(350,250);
        cont.setLayout(new FlowLayout());
        cont.add(new JButton("Isto é um botão"));
        frame.setVisible(true);        
    }
    
    
    
    
}
