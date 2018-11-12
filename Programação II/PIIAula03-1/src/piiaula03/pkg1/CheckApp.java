/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author danilo
 */
public class CheckApp {
    
    public static void main(String args[]){
        JFrame f = new JFrame("Aplicação");
        f.setSize(350,250);
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new JCheckBox("Masculino"));
        cont.add(new JCheckBox("Feminino"));
        f.setVisible(true);
    }
    
}
