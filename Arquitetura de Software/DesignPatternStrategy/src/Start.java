
import comStrategy.Frete;
import comStrategy.TipoFrete;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Start {
        
    
    public static void main (String args[]){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a distancia:");
        int distancia = entrada.nextInt();
        System.out.println("Qual o tipo do frete? "
                + "1 - Normal, 2 - Sedex ,"
                + " 3 - Transportadora");
        int opcaoFrete = entrada.nextInt();
        TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete -1];
        Frete frete = tipoFrete.obterFrete();
        double preco  = frete.calcularPreco(distancia);
        System.out.println("O valor total é de "
                + "R$ "+preco);
        
        
    }
}
