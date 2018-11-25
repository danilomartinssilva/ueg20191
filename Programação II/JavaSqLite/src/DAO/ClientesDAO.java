/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class ClientesDAO {
    public static ArrayList<Clientes> todosClientes = new ArrayList<>();
    private static Connection conn;
    private static String READ = "SELECT * FROM clientes";
    private static String INSERT = "INSERT INTO clientes ("
            + "nome,email,idade,telefone,cpf,endereco)"
            + "VALUES (?,?,?,?,?,?)";
    public static boolean create(){
        conn =Database.getConnection();
        Clientes c = new Clientes();
        try{            
            PreparedStatement ps = conn.prepareStatement(INSERT);
            ps.setString(0, c.getNome());
            ps.setString(1, c.getEmail());
            ps.setInt(2, c.getIdade());
            ps.setString(3, c.getTelefone());
            ps.setString(4, c.getCpf());
            ps.setString(5, c.getEndereco());   
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("Houve um erro na inserção"+e.getMessage());
            return false;
        }
    }
    public static List<Clientes> listAllClientes(){
        conn = Database.getConnection();
        List<Clientes> clientes = new ArrayList<>();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(READ);
            while(rs.next()){
                Clientes c = new Clientes();
                c.setNome(rs.getString("nome"));
                c.setId(rs.getInt("id"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                c.setIdade(rs.getInt("idade"));
                c.setEndereco(rs.getString("endereco"));
                clientes.add(c);
                
            }
        }
        catch(SQLException e ){
            System.out.println("Houve um erro ao consultar: "+e.getMessage());
        
    }
        return clientes;
    }
}
