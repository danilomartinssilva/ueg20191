/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection = null;
    private static String PATH = "jdbc:sqlite:F:\\base_estudo_programacaoII.db";
    
    public static void setConnection(){
        Connection conn = null;
        try{
            Class.forName("org.sqlite.JDBC");
        }
        catch(ClassNotFoundException e){
            System.out.println("Classe JDBC não encontrada, "+e.getMessage());
        }
        try{
            conn = DriverManager.getConnection(PATH);
        }
        catch(SQLException e){
            System.out.println("Erro ao connectar" +e.getMessage());
        }
        Database.connection = conn;        
    }
    public static Connection getConnection(){
        if(Database.connection==null){
            System.out.println("Nulo");
            setConnection();
            System.out.println("Conexão criada!");
        }
        return Database.connection;
    }
   
   
    
}
