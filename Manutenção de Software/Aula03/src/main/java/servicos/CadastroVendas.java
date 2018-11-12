/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import entidades.*;


/**
 *
 * @author danilo
 */
public class CadastroVendas {
    public void cadastraVenda(){
        try{
        Curso curso = new Curso("Programação II","P200");
        Aluno aluno = new Aluno();
        aluno.setNome("Fulano");
        aluno.setEmail("email@email.com");
        aluno.setCurso(curso);
        aluno.setIdade(28);
        aluno.setEndereco("Rua x, 110 - Centro");
        Venda venda = new Venda();
        venda.setCurso(curso);
        venda.setValor(29.99);
        venda.setDesconto(10);        
        venda.valorTotal();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
    
    
}
