package projeto.persistencia.arquivo;

import projeto.entidades.Cliente;
import projeto.persistencia.ClienteDAO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.entidades.Cliente;

public class ClienteDAOImplArq implements ClienteDAO{

    private final String filename = "cliente.dat";
    private List<Cliente> clientes = new ArrayList<Cliente>();

    private void salvarArquivo(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(clientes);
            oos.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            Logger.getLogger(ClienteDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadArquivo(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            clientes = (List<Cliente>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AgenciaDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AgenciaDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgenciaDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@Override
    public void inserir(Cliente cl) {
        loadArquivo();
        boolean existe = false;

        for (Cliente c : clientes) {
            if(c.getCPF() == cl.getCPF()){
                existe = true;
                break;
            }
        }
        if(!existe){
            clientes.add(cl);
            salvarArquivo();
            System.out.println("Agencia cadastrado com Sucesso!");
        }else{
            System.out.println("Agencia já cadastrado!");
        }
    }

    @Override
    public void editar(Cliente cl) {
        loadArquivo();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if(c.getCPF() == cl.getCPF()){
                clientes.set(i, cl);
                salvarArquivo();
                break;
            }
        }
    }

    @Override
    public boolean remover(int CPF) {
        loadArquivo();

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if(c.getCPF() == CPF){
                clientes.remove(i);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    @Override
    public Cliente getByCPF(int CPF) {
        loadArquivo();
        for (Cliente c : clientes) {
            if(c.getCPF() == CPF){
                return c;
            }
        }

        return null;
    }

    @Override
    public List<Cliente> listar() {
        loadArquivo();
        return clientes;
    }

}