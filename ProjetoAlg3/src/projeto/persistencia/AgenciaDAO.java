package projeto.persistencia;

import projeto.entidades.Agencia;

import java.util.List;

public interface AgenciaDAO{

    public void inserir(Agencia ag);

    public void editar(Agencia ag);

    public boolean remover(int numeroAg);

    public Agencia getBynumeroAg(int numeroAg);

    public List<Agencia> listar();
}