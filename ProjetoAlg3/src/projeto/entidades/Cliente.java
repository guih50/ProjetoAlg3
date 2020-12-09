
package projeto.entidades;
import java.io.Serializable;

public class Cliente extends Endereco implements Serializable {
    private int CPF;
    private int Conta;
    private String Nome;
    private Endereco endereco;

    public int getCPF(){
        return CPF;
    }
    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    public int getConta(){
        return Conta;
    }
    public void setConta(int Conta){
        this.Conta = Conta;
    }
    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public Endereco getendereco(){
        return endereco;
    }
    public void setendereco(Endereco endereco){
        this.endereco = endereco;
    }
}