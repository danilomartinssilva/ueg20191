/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.br.exemplomockito;

/**
 *
 * @author danilo
 */
public class OperacoesMatematicas implements InterfaceOperacoesMatematicas{
    @Override
    public int soma (int x, int y){
        return 0;
    }
    @Override
    public int divisao (int x, int y){
        return x/y;        
    }
    @Override
    public int subtracao (int x, int y){
        return x-y;
    }
    @Override
    public int multiplicacao (int x, int y){
        return x*y;
    }
    
    
}
