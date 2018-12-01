/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Danilo
 */
public class ListaDeClientesTableModel extends AbstractTableModel {
    private List<Clientes> dadosTabela = ClientesDAO.listAllClientes();
    private String[] colunas = {"id","Nome","Email","Telefone","Idade"};
    
    public int getRowCount(){
        return dadosTabela.size();
    }
    @Override
    public int getColumnCount(){
       return colunas.length;
    }
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        switch(columnIndex){
            case 0:
                return dadosTabela.get(rowIndex).getId();
            case 1:
                return dadosTabela.get(rowIndex).getNome();
                 case 2:
                return dadosTabela.get(rowIndex).getEmail();
                case 3:
                return dadosTabela.get(rowIndex).getTelefone();
                case 4:
                return dadosTabela.get(rowIndex).getIdade();
                
         
                
        }
        return null;
    }
}
