/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.br.ensaio0810;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author danilo
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
    @Mock
    CalculadoraService calculadoraservice;
    
    @InjectMocks
    MathApplication service;
    
    
    public MathApplicationTest() {
    }

    @Test
    public void testAdd() {
        Mockito.when(calculadoraservice.add(10, 20)).thenReturn(30);
        
        assertEquals(service.add(10,20),30);
        
       Mockito.verify(calculadoraservice).add(10, 20);
        

        
        
        Mockito.verify(calculadoraservice,Mockito.times(2)).add(10, 20);
        
        
        
        
    }
    
    
    
}
