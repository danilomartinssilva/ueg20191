
import entidade.Aluno;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Main {
        
        @Test
        public  void teste(){
            //cenario
            Aluno a = new Aluno();
            a.setNome("Danilo Martins");
            a.setEmail("danilo.silva@email.com");
            a.setSenha("123456");
            
            //acao
            
            //verificacao
            System.out.println(a.getEmail().equals("danilo.silva@email.com"));
       
            
        }
        
        
}
