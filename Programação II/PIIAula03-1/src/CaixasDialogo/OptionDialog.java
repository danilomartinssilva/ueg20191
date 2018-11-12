/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaixasDialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class OptionDialog {
   
    public OptionDialog(){
        
        String[] opcoes = {"Voltar","Repetir","Avançar",};
        int resposta;
        resposta = JOptionPane.showOptionDialog(null,
                "Você fez 1000 pontos nessa fase. "
                        + "O que deseja fazer?","Jogo",0,
                        JOptionPane.QUESTION_MESSAGE,null,
                        
                        opcoes,opcoes[2]);  
        System.out.println(resposta);
    }
}
