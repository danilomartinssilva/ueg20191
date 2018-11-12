/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucao;

/**
 *
 * @author danilo
 */
public class Lampada implements Dispositivo{
        @Override
        public void ligar(){
           System.out.println("Ligar lampada");
       }
        @Override
        public void desligar(){
            System.out.println("Desligar lampada");
       }
}
