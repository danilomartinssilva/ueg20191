/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comStrategy;

/**
 *
 * @author danilo
 */
public enum TipoFrete {
    
    NORMAL{
        public Frete obterFrete(){
           return new Normal();
        }
    },
    
    SEDEX{
        @Override
        public Frete obterFrete(){
            return new Sedex();
        }
    },
    TRANSPORTADORA{
        @Override
        public Frete obterFrete(){
            return new Transportadora();
        }
    };
    public abstract Frete obterFrete();
    
    
    
}
