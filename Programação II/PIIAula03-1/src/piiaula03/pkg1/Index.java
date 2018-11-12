/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula03.pkg1;

import javax.swing.JFrame;


public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       minhaTela();
       JaAppletAppMethod();
    }
    static public void minhaTela(){
        JFrame frame = new JFrame("Primeira Aplicação");
        frame.setSize(350,250);
        frame.setVisible(true);
    }
    static public void JaAppletAppMethod(){
        JAppletApp j = new JAppletApp();
        j.init();
    }
    
}
