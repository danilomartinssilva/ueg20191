
package abstracao;

public abstract  class Pessoa {
    protected String nome,email,
            dtNascimento,sobrenome;
    
    abstract public void setSobrenome(String sobrenome);
    abstract public String getSobrenome();
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEmail(String email){
        this.email  = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setDtNascimento(String dtNascimento){
        this.dtNascimento = dtNascimento;
    }
    public String getDtNascimento(){
        return this.dtNascimento;
    }
    
    
}
