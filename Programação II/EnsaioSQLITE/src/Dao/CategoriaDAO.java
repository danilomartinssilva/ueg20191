/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Categoria;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Danilo
 */
public class CategoriaDAO {
    
    public static ArrayList<Categoria> allCategorias = new ArrayList();
    
    private static String insercao = "INSERT INTO categoria (nome_categoria) VALUES (?)";
    
    private static Connection conn;
    
    public static List<Categoria> all(){
        conn = Database.getConnection();
        List<Categoria> categorias = new ArrayList<>();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM categoria");
            while(rs.next()){
                Categoria c = new Categoria();
                c.setId_categoria(rs.getString("id_categoria"));
                c.setNome_categoria(rs.getString("nome_categoria"));
                categorias.add(c);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        //System.out.println(Arrays.toString(categorias.toArray()));
        return categorias;
    }
    public static Boolean create (){
        conn = Database.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement("INSERT INTO categoria (nome_categoria) VALUES  (?)");
            ps.setString(1, "Danilo Lindo");
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
   
 
    
}
