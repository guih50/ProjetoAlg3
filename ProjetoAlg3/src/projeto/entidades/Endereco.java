/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.entidades;

import java.io.Serializable;

public class Endereco implements Serializable{
    private String Cidade;
    private String Bairro;
    private String Rua;
    private int Numero;
    
    public String getCidade(){
        return Cidade;
    }
    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }
    public String getBairro(){
        return Bairro;
    }
    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }
    public String getRua(){
        return Rua;
    }
    public void setRua(String Rua){
        this.Rua = Rua;
    }
    public int getNumero(){
        return Numero;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }

}