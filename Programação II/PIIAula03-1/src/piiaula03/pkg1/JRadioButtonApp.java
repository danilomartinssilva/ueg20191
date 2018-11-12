/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author danilo
 */
public class JRadioButtonApp {
    
    public static void main(String args[]){
        JFrame f = new JFrame("Aplicação");
        f.setSize(300,250);
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        ButtonGroup btg = new ButtonGroup();
        JRadioButton rb = new JRadioButton("Pequeno",true);
        btg.add(rb);
        cont.add(rb);
        rb = new JRadioButton("Grande");
        cont.add(rb);
        btg.add(rb);
        rb = new JRadioButton("Médio");
        btg.add(rb);
        cont.add(rb);
        f.setVisible(true);
        
        
        
        
        
    }
}
