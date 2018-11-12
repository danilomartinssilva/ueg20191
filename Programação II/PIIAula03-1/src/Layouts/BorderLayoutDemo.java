/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author danilo
 */
public class BorderLayoutDemo {
    
    public BorderLayoutDemo(){
        JFrame f= new JFrame("BorderLayoutDemo");
        Container cont = f.getContentPane();
        cont.setLayout(new BorderLayout());
        cont.add(new JButton("Botão 1 - Start"),
                        BorderLayout.PAGE_START);        
        cont.add(new JButton("Botão 2 - Center"),
                        BorderLayout.CENTER);
        cont.add(new JButton("Botão 3 - LINE_START"),
                        BorderLayout.LINE_START);
        cont.add(new JButton("Botão 4 - LINE END"),
                        BorderLayout.LINE_END);
        cont.add(new JButton("Botão 5 - PAGE_END"),
                        BorderLayout.PAGE_END);
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
}
