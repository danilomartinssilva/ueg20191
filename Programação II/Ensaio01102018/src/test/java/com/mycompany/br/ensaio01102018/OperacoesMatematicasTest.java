/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.br.ensaio01102018;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author danilo
 */
public class OperacoesMatematicasTest {
    
    OperacoesMatematicas appObject;
    @Before
    public void create (){
        appObject = new OperacoesMatematicas();
    }
    @Before 
    public void mockitoCreate(){
        appObject = mock(OperacoesMatematicas.class);
        when(appObject.add(1,2)).thenReturn(3);
        when(appObject.sub(4,3)).thenReturn(1);
        when(appObject.mult(3,5)).thenReturn(15);
        when(appObject.div(39,13)).thenReturn(3);
    }
       @Test
    public void testAdd() throws Exception {
        assertSame(3, appObject.add(1,1));

    }

    @Test
    public void testSub() throws Exception {
        assertSame(1, appObject.sub(4,3));
    }

    @Test
    public void testMult() throws Exception {
        assertSame(15, appObject.mult(3,5));
    }

    @Test
    public void testDiv() throws Exception {
        assertSame(3, appObject.div(39,13));
    }

    @After
    public void notifyComplete() {
        System.out.print("testing complete");
    }
    
    
}
