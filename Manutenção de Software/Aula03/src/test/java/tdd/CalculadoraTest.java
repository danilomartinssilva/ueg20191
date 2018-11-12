/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danilo
 */
public class CalculadoraTest {
    
    public CalculadoraTest(){
        
    }
    
    @BeforeClass
    public static void setUpClass(){
        
    }
    @AfterClass
    public static void tearDownClass(){
        
    }
    @After
    public void tearDown(){
        
    }
    @Before 
    public void setUp(){
        
    }
    @Test
    public void testCalcularSoma(){
        Calculadora c = new Calculadora();        
        assertTrue(c.calcularSoma(8,4)==12);
        
    }
    
    @Test
    public void testCalcularSubtracao(){
        Calculadora c = new Calculadora();
        assertTrue(c.calcularSubtracao(8,4)==4);
        
    }
    
}
