/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author danilo
 */
public interface BancoDeDados {
    
    
  /** * Método que recebe as configuraçõoes de conexão
     * @param user
     * @param password
     * @param db
     * @param port 
     */
   public void conexaoBd(String user,String password,String db,Integer port) ;
   
   public void insert();
   public void delete();
   public void update ();
   public void read();
   public boolean statusConexao();
   
   
    
}
