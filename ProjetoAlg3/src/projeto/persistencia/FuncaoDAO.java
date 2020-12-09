package projeto.persistencia;

import projeto.entidades.Funcao;

import java.util.List;

public interface FuncaoDAO{

    public void inserir(Funcao id);

    public void editar(Funcao id);

    public boolean remover(int Codigo);

    public Funcao getByCodigo(int Codigo);

    public List<Funcao> listar();
}