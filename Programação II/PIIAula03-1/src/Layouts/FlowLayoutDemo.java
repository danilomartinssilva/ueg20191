/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
public class FlowLayoutDemo {
    
    public FlowLayoutDemo (){
        JFrame f = new JFrame("FloatLayoutDemo");
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new JButton("Botão 1"));
        cont.add(new JButton("Botão 2"));
        cont.add(new JButton("Botão 3"));
        cont.add(new JButton("Botão 4"));
        f.setSize(400, 100);
        f.setVisible(true);
    }
}
