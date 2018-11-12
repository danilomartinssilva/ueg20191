/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class AlunoTest {
    private Aluno a;
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new Aluno();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        a.setNome("Danilo");
        assertEquals("Danilo", a.getNome());
        assertTrue(a.getNome().length()>0);
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
        
    }

    /**
     * Test of getEmail method, of class Aluno.
     */
    @Test
    public void testGetEmail() {
        
    }

    /**
     * Test of setEmail method, of class Aluno.
     */
    @Test
    public void testSetEmail() {
        
    }

    /**
     * Test of getSenha method, of class Aluno.
     */
    @Test
    public void testGetSenha() {
        
    }

    /**
     * Test of setSenha method, of class Aluno.
     */
    @Test
    public void testSetSenha() {
        
    }
    
}
