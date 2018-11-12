/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.br.exemplomockito;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

/**
 *
 * @author danilo
 */
public class OperacoesMatematicasTest {
    
    OperacoesMatematicas op ;
    
    @Before
    public void create(){
        op = new OperacoesMatematicas();
    }
    @Before
    public void mockitoCreate(){
        
        op = mock(OperacoesMatematicas.class); 
        
    }
    
    @Test
    public void testSoma(){

        
        Mockito.when(op.soma(1,2)).thenReturn(6);
        assertEquals(6, op.soma(1, 2));
        
    }
    
    @Test
    public void testSubtracao(){
        Mockito.when(op.subtracao(1,2)).thenReturn(-1);
        assertEquals(-1, op.subtracao(1, 2));
    }
    
    
}
