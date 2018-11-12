package padraosingleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Produtos {
    
    private String nomeProduto;
    private int codigoProduto;
    private String descricaoProduto;
    private int qtdEstoqueProduto;
    private double precoProduto;
    private static Produtos instancia;

    /**
     * @return the nomeProduto
     */
    public static Produtos getInstance(){
           if(instancia==null){
               instancia = new Produtos();             
           }        
             return instancia;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the codigoProduto
     */
    public int getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the qtdEstoqueProduto
     */
    public int getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    /**
     * @param qtdEstoqueProduto the qtdEstoqueProduto to set
     */
    public void setQtdEstoqueProduto(int qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    /**
     * @return the precoProduto
     */
    public double getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
}
