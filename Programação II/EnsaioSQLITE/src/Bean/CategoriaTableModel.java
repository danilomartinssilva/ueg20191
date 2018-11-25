/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.CategoriaDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danilo
 */
public class CategoriaTableModel extends AbstractTableModel{
    
    private List<Categoria> dados = CategoriaDAO.all();
    private String[] colunas = {"Id","Nome"};
    
    @Override
    public int getRowCount(){
        return this.dados.size();
    }
    @Override
    public int getColumnCount(){
        return this.colunas.length;
    }
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        switch(columnIndex){
            case 0:
                    return dados.get(rowIndex).getId_categoria();
            case 1:
                    return dados.get(rowIndex).getNome_categoria();        
                    
        }
        
        return null;
        
    }
    
}
