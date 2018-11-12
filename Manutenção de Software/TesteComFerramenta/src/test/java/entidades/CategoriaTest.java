/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
public class CategoriaTest {
    private Categoria categoria;
    
    public CategoriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        categoria = new Categoria();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNome method, of class Categoria.
     */
    @Test
    public void testSetNome() {
        
    }

    /**
     * Test of getNome method, of class Categoria.
     */
    @Test
    public void testGetNome() {
      categoria.setNome("Informática");
        assertTrue(categoria.getNome().equals("Informática"));
        assertFalse(categoria.getNome().length()>15);
        assertEquals("Informática", categoria.getNome());
        
        
    }

    /**
     * Test of setCode method, of class Categoria.
     */
    @Test
    public void testSetCode() {
    
    }

    /**
     * Test of getCode method, of class Categoria.
     */
    @Test
    public void testGetCode() {
       
    }
    
}
