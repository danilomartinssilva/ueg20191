package eventos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Introducao extends JFrame implements ActionListener {
    static private JTextField tf = new JTextField();
    static private JTextField tf1 = new JTextField();
    static private JButton b1 = new JButton("Somar");       
    static private JButton b2 = new JButton("Subtrair");
    
    
    public static void main (String args[]){
        Introducao frame = new Introducao();
        frame.setSize(300,300);
        Container cont = frame.getContentPane(); 
        
        cont.add(tf,BorderLayout.NORTH);
        cont.add(tf1,BorderLayout.SOUTH);
        cont.add(b1,BorderLayout.LINE_END); 
        cont.add(b2,BorderLayout.LINE_START);
        b1.addActionListener(frame);        
        b2.addActionListener(frame);        
        frame.setVisible(true); 
        
    }
    @Override
    public void actionPerformed(ActionEvent e){   
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(null,       
            Integer.parseInt(tf.getText())
           +
            Integer.parseInt(tf1.getText()));   
        }
        if(e.getSource()==b2){
            JOptionPane.showMessageDialog(null,       
            Integer.parseInt(tf.getText())
           -
            Integer.parseInt(tf1.getText())); 
        }
    }
    
}
