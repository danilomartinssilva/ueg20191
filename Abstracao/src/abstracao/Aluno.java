package abstracao;

public class Aluno extends Pessoa{
    @Override
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    @Override
    public String getSobrenome(){
        return this.sobrenome;
    }
    
}
