/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidaula01;

/**
 *
 * @author danilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Jornal jornal = new Jornal();
        jornal.addEntrada("Texto");
        jornal.addEntrada("Outro Texto");
        jornal.addEntrada("Novamente outro texto");
        jornal.addEntrada("Novamente outro texto");
        jornal.addEntrada("Novamente outro texto");
        jornal.addEntrada("Novamente outro texto");
        
        System.out.println();
        
        String nomearquivo = "jornal.txt";
        Persistencia p = new Persistencia();
        //Enviando dados para salvar no arquivo
        p.salvarArquivo(nomearquivo, jornal, true);
        
        //abrir o bloco de notas
        Runtime.getRuntime().exec("notepad.exe "+nomearquivo);
        
    }
    
}
