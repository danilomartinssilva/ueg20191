/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;



/**
 *
 * @author danilo
 */
public class Produto {
    private Categoria categoria;
    private String nome;
    private String descricao;
    private Double preco;
    
    public void setNome(String nome){
        this.nome = nome;        
    }
    public String getNome(){
        return this.nome;
    }    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public Double getPreco(){
        return this.preco;
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.getNome()+
                " Categoria: "+this.getCategoria().getNome()+
                " Nome: "+ this.getNome()+
                " Descricao: "+ this.getDescricao()+
                " Preço: R$"+ this.getPreco();
    }

  @Override
  public boolean equals(Object obj){
    if(this==obj){
        return true;
    }
    if(this==null){
        return false;        
    }
    if(getClass()!=obj.getClass()){
        return false;
    }
    Produto other = (Produto) obj;
    if(nome==null){
        if(other.nome!=null){
            return false;
        }
    }else if(!nome.equals(other.nome)){
        return false;
    }
    return true;
  }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }
    
    
}
