package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Database {
    
    private static Connection connection = null;
    private static final String PATH = "jdbc:sqlite:F:\\\\base1.db";
    
    public static void setConnection (){
        Connection conn = null;
        try{
            Class.forName("org.sqlite.JDBC");
               
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            conn = DriverManager.getConnection(PATH);          
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        Database.connection = conn;
        
    }
    public static Connection getConnection(){
       if(Database.connection==null || Database.connection.equals("")){
           System.out.println("Nulo");
           setConnection();           
       }
       return Database.connection;

    }
    
}
