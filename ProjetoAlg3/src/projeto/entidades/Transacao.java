package projeto.entidades;

import java.io.Serializable;


/**
 *
 * @author Vitor Lucas
 */
public class Transacao implements Serializable{
    private int Valor;
    private int CPF;
    private int CPF2;
    private int Conta;
    private int Conta2;
    
    public int getValor() {
        return Valor;
    }
    public void setValor(int Valor){
        this.Valor = Valor;
    }
     public int getCPF() {
        return CPF;
    }
     public void setCPF(int CPF){
        this.CPF = CPF;
    }
     public int getConta2() {
        return Conta2;
    }
     public void setConta2(int Conta2){
        this.Conta2 = Conta2;
    }

     public int getCPF2() {
        return CPF2;
    }
     public void setCPF2(int CPF2){
        this.CPF2 = CPF2;
    }
     public int getConta() {
        return Conta;
    }
     public void setConta(int Conta){
        this.Conta = Conta;
    }

}
