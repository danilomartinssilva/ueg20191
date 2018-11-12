/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semStrategy;

/**
 *
 * @author danilo
 */
public class Frete {
      private TipoFrete tipo;
      
      public Frete(TipoFrete tipo){
        this.tipo = tipo;
      }
      public double CalcularFrete(int distancia){
          double preco = 0;
          if(TipoFrete.NORMAL.equals(tipo)){
              preco = distancia * 1.25 +10;
          }
          else if(TipoFrete.SEDEX.equals(tipo)){
              preco = distancia * 1.45 + 12;
          }
          else{
              preco = 100.99;
          }
          return preco;
      }
      
    
}
