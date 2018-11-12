/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.hamcrest.CoreMatchers;
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
public class VendaTest {
    
    
    public VendaTest() {        
    }
    
    

    @Test
    public void testGetCurso() {
       Curso c = new Curso("Sistemas", "SI2018");
        assertTrue(c.getNome().equals("Sistemas"));
        assertTrue(c.getNome().equalsIgnoreCase("sistemas"));
/*        assertTrue(c.getNome().equals(null));*/
        
        
    }

    /**
     * Test of setValor method, of class Venda.
     */
  
    @Test
    public void testGetValor() {
      try{  
      Curso c = new Curso("Sistemas","SI2018");
      Venda venda = new Venda();
      venda.setCurso(c);
      venda.setDesconto(50);
      venda.setValor(-100);
      assertTrue(venda.valorTotal()==-50);
      assertThat(venda.valorTotal(), CoreMatchers.is(15.0));
      }catch(Exception e ){
          e.printStackTrace();
          /*System.out.println(e.getMessage());*/
          fail("Erro!!!");
          
          /*System.out.println(e.getMessage());*/
      }
        
        
        
    }

  
    
}
