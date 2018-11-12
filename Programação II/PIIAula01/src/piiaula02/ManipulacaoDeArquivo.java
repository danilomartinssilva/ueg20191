/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiaula02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author danilo
 */
public class ManipulacaoDeArquivo {
    
    public void adicionarArquivo(String conteudo,String nomearquivo){  
         try{
        //Instancia da classe arquivo e passa o nome do arquivo
            File arquivo = new File(nomearquivo);
            //Verifica se o arquivo existe
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
            //Prepara para a escrita do arquivo
            FileWriter fw = new FileWriter(arquivo.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(conteudo);//Grava conteúdo no arquivo
            bw.close();        //Fecha o arquivo
        }
        catch(IOException e){
            System.out.println("Erro na escrita do arquivo "+e.getMessage());
        }
    }
    public void lerArquivo(String nomearquivo){
        try{
        FileReader ler = new FileReader(nomearquivo);
        BufferedReader reader = new BufferedReader(ler);
        String linha;
        while((linha=reader.readLine()) !=null){
            System.out.println(linha);
        }
        System.out.println("Leitura finalizada");
        }
        catch(IOException e){
            System.out.println("Erro ao ler o arquivo: "+e.getMessage());
        }
        
    }
}
