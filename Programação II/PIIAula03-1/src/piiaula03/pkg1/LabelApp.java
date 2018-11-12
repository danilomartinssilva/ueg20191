/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author danilo
 */
public class LabelApp {
    
    public static void main(String args[]){
        JFrame frame = new JFrame("Aplicação");
        frame.setSize(320,250);
        Container cont = frame.getContentPane();
        cont.setLayout(new GridLayout(2,1));
        cont.add(new JLabel("Isto é um rótulo"));
        frame.setVisible(true);
    }
    
}
