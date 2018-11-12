
import piiaula02.*;

public class Bootstrap {
    public static void main(String args[]){
        /*ManipulacaoDeArquivo m = new ManipulacaoDeArquivo();
        m.adicionarArquivo("O arquivo deve ser "
                + "escrito com sucesso",
                "Teste.xls");
        m.lerArquivo("Teste.xls");        
        */
        /*
        ReferenciaNula r = new ReferenciaNula();
        r.cadastraPessoa();
        */
      /*  try{
        ContaCorrente c = new ContaCorrente();
        c.depositar(20);           
        c.sacar(150);
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        */
        try{
            ContaEstudante c = new ContaEstudante();
            c.rendimentoAluno();
        }catch(MinhaException e ){
            System.out.println(e.getMessage());
        }
        
            
        
    }
    
    
}
