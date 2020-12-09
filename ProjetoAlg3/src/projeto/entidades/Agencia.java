
package projeto.entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Vitor Lucas
 */
public class Agencia extends Endereco implements Serializable{
    private int numeroAg;
    private Endereco endereco;
    


    public int getnumeroAg() {
        return numeroAg;
    }
    public void setnumeroAg(int numeroAg){
        this.numeroAg = numeroAg;
    }
    public Endereco getendereco(){
        return endereco;
    }
    public void setendereco(Endereco endereco){
        this.endereco = endereco;
    }
}
