/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01ts;

import entidade.Aluno;



/**
 *
 * @author danilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Danilo");
        a.setSobrenome("Martins");
        a.setEmail("danilo.silva@email.com");
        a.setMatricula("20180621");
        a.setIdade(28);
        //TENHO QUE TER COMO RESPOSTA APENAS 28
        
        System.out.println("Nome: "+ a.getNome()+
                "| Email: "+a.getEmail()+ "| Matrícula:"+a.getMatricula()+
                "| Idade "+a.getIdade());
        
        //PASSAR
         System.out.println(a.getEmail().equals("danilo.silva@email.com"));   
        //NÃO PASSAR
        System.out.println(a.getEmail().equals("danilo.silva@gmail.com"));
        
    }
    
    
    
    
}
