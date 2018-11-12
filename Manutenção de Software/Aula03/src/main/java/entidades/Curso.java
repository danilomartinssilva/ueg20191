/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author danilo
 */
public class Curso {
    private String nome,codigo;
    
   public Curso(String nome, String codigo){
       this.nome = nome;
       this.codigo = codigo;   
   }
   public String getNome(){
       return this.nome;
   }
   public String getCodigo(){
       return this.codigo;
   }
   
    @Override
   public String toString(){
   
       return "Curso:"+this.nome
              + "- Codigo:"+this.codigo;
   
   }
    
}
