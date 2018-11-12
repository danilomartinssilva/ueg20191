/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class OperacoesAritmeticas extends JFrame implements ActionListener{
    static private JButton btnSoma = new JButton("Soma");
    static private JButton btnSub = new JButton("Subtração");
    static private JButton btnMult = new JButton("Multiplicação");
    static private JButton btnDiv = new JButton("Divisão");
    static private JButton btnRaiz = new JButton("Raiz Quadrada");
    static private JButton btnPotencia = new JButton("Potência");
    
    static private TextField txVal = new TextField();
    static private TextField txVal1 = new TextField();
    
    public static void main(String args[]){
        
        OperacoesAritmeticas frame = new OperacoesAritmeticas();
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        txVal.setColumns(10);
        txVal1.setColumns(10);
        cont.add(txVal);
        cont.add(txVal1);
        cont.add(btnSoma);
        cont.add(btnSub);
        cont.add(btnMult);
        cont.add(btnDiv);
        cont.add(btnRaiz);
        cont.add(btnPotencia);
        frame.setSize(700,100);
        frame.setLocation(1024/3, 768/2);
        btnSoma.addActionListener(frame);
        btnSub.addActionListener(frame);
        btnMult.addActionListener(frame);
        btnDiv.addActionListener(frame);     
        btnRaiz.addActionListener(frame);
        btnPotencia.addActionListener(frame);
        frame.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSoma){
            retornaResultado(Integer.parseInt(txVal.getText())+
                    Integer.parseInt(txVal1.getText()));
        }
    
        if(e.getSource()==btnSub){
            retornaResultado(Integer.parseInt(txVal.getText())-
                    Integer.parseInt(txVal1.getText()));
        }
        if(e.getSource()==btnDiv){
            retornaResultado(Integer.parseInt(txVal.getText())/
                    Integer.parseInt(txVal1.getText()));
        }
        if(e.getSource()==btnMult){
            retornaResultado(Integer.parseInt(txVal.getText())*
                    Integer.parseInt(txVal1.getText()));
        }
        if(e.getSource()==btnRaiz){
            double raiz = Double.parseDouble(txVal.getText());
            double resultado = Math.sqrt(raiz);
              JOptionPane.showMessageDialog(null, 
                "O resultado é: "+resultado);
        }
        if(e.getSource()==btnPotencia){
            double valor1 = Double.parseDouble(txVal.getText());
            double valor2 = Double.parseDouble(txVal1.getText());
            double potencia = Math.pow(valor1, valor2);
             JOptionPane.showMessageDialog(null, 
                "O resultado é: "+ potencia);
        }
    }
    public void retornaResultado(Integer resultado){
        JOptionPane.showMessageDialog(null, 
                "O resultado é: "+resultado);
    }
    
    
    
    
}
