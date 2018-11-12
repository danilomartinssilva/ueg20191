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
public class AlunoTest {
    
    private Aluno aluno;
    
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Executado apenas uma vez!");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Final do teste"); 
        
    }
    
    @Before
    public void setUp() {
        System.out.println("instância da classe aluno");
        
       aluno = new Aluno();
       
    }
    
    @After
    public void tearDown() {
        System.out.println("Final do método");
        
    }

    /**
     * Test of getCurso method, of class Aluno.
     */
    @Test
    public void testGetCurso() {
        
    }

    /**
     * Test of setCurso method, of class Aluno.
     */
    @Test
    public void testSetCurso() {
       
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        
        aluno.setNome("Danilo");
        //Assertivas
        assertTrue(aluno.getNome().length()>0);
        assertFalse(aluno.getNome().isEmpty());
        
        
        
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getIdade method, of class Aluno.
     */
    @Test
    public void testGetIdade() {
        
        aluno.setIdade(18);
        assertTrue(aluno.getIdade()>0);
        assertTrue(aluno.getIdade().equals(18));
        
    }

    /**
     * Test of setIdade method, of class Aluno.
     */
    @Test
    public void testSetIdade() {
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
     * Test of getEndereco method, of class Aluno.
     */
    @Test
    public void testGetEndereco() {
        
        
    }

    /**
     * Test of setEndereco method, of class Aluno.
     */
    @Test
    public void testSetEndereco() {
    }
    
}
