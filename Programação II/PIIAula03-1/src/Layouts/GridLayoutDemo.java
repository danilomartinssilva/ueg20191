/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author danilo
 */
public class GridLayoutDemo {
    
    public GridLayoutDemo(){
        JFrame f = new JFrame("GridLayoutDemo");
        Container c = f.getContentPane();
        c.setLayout(new GridLayout(0,2));
        c.add(new JButton("Botão 1"));
        c.add(new JTextField());
        f.setSize(100,100);
        f.setVisible(true);
        
    }
}
