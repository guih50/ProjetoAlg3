package projeto.utils;

import projeto.entidades.Agencia;
import projeto.persistencia.AgenciaDAO;
import projeto.persistencia.arquivo.AgenciaDAOImplArq;
import projeto.entidades.Cliente;
import projeto.persistencia.ClienteDAO;
import projeto.persistencia.arquivo.ClienteDAOImplArq;
import projeto.persistencia.FuncaoDAO;
import projeto.entidades.Funcao;

import projeto.persistencia.TransacaoDAO;
import projeto.persistencia.arquivo.TransacaoDAOImplArq;
import projeto.persistencia.arquivo.FuncaoDAOImplArq;



public class DAOFactory {

    public static AgenciaDAO createAgenciaDAO(){
        return new AgenciaDAOImplArq();
    }
    public static FuncaoDAO createFuncaoDAO(){
        return new FuncaoDAOImplArq();
    }
    public static ClienteDAO createClienteDAO(){
        return new ClienteDAOImplArq();
    }

    public static TransacaoDAO createTransacaoDAO() {
        return new TransacaoDAOImplArq();
    }
 
}