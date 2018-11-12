/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

/**
 *
 * @author danilo
 */
public class ContaEstudante extends ContaComum{
        private int milhas;
        
        @Override
        public void deposita(double valor){
            super.deposita(valor);
            this.milhas +=(int) valor;            
        }
        public int getMilhas(){
            return this.milhas;
        }
        @Override
        public void rendimento(){
            throw new 
          RuntimeException("Não pode render");
            
        }
}
