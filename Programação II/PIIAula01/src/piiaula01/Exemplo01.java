/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula01;

/**
 *
 * @author danilo
 */
public class Exemplo01 {
    
    public void percorrerVetor(){
        try{
            String[] frutas = new String[9] ;
            frutas[0]="laranja";
            frutas[1]="maça";
            frutas[2]="melancia";            
            
            for(int i=0;i<=15;i++){
                System.out.println(frutas[i]);            
            }
            
            
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            
            System.out.println("Erro ao retornar: "+e.getMessage());
        }
        
    }
    public int divisao(int x, int y){        
        try{        
          return x/y;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro na execução da tarefa" + e.getMessage());
            return 0;
        }
    }
 
    
}
