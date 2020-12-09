package projeto.entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Vitor Lucas
 */
public class Funcao extends Endereco implements Serializable{
    private int Codigo;
    private int Salario;
    private Endereco endereco;
    private String Cargo;
    private String Nome;
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
     public int getSalario() {
        return Salario;
    }
    public void setSalario(int Salario){
        this.Salario = Salario;
    }
    public String getCargo(){
        return Cargo;
    }
    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    public Endereco getendereco(){
        return endereco;
    }
    public void setendereco(Endereco endereco){
        this.endereco = endereco;
    }
}
