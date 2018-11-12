/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidaula01;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

/**
 *
 * @author danilo
 */
public class Persistencia {
    /**
     * Salvando conteúdo no arquivo TXT
     * @param nomearquivo
     * @param jornal
     * @param reescrever
     * @throws Exception 
     */
    public void salvarArquivo(String nomearquivo, 
            Jornal jornal, boolean reescrever) throws  Exception{
        
        if(reescrever || new File(nomearquivo).exists()){
            try(PrintStream out = new PrintStream(nomearquivo)){
                out.println(jornal.toString());
            }
        }
    }
    public void carregarArquivo(Jornal jornal, String nomearquivo){
        
    }
    public void carregarArquivo(Jornal jornal, URL url){
        
    }
    
    
}
