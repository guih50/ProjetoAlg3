/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.persistencia;

import java.util.List;
import projeto.entidades.Cliente;

/**
 *
 * @author guih5
 */
public interface ClienteDAO {
    public void inserir(Cliente ag);

    public void editar(Cliente ag);

    public boolean remover(int CPF);

    public Cliente getByCPF(int CPF);

    public List<Cliente> listar();

}