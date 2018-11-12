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
public class Venda {
    private Curso curso;
    private double valor;
    private double desconto;
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    public Curso getCurso(){
        return this.curso;
    }
    public void setValor(double valor) throws Exception{ 
        if(valor<=0){
            throw new Exception("Valor inválido");
        }
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    public double getDesconto(){
        return this.desconto;
    }
    
    public double valorTotal() throws Exception{
        
        double desconto = this.getValor()*
                (this.getDesconto()/100);
        if(this.getValor()-desconto<=0){
            throw new Exception("O valor está abaixo de zero");
        }
        return this.getValor()-desconto;
       
    }
    
    
}
