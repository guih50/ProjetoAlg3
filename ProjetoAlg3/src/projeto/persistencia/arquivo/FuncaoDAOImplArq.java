package projeto.persistencia.arquivo;

import projeto.entidades.Funcao;
import projeto.persistencia.FuncaoDAO;
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

public class FuncaoDAOImplArq implements FuncaoDAO {
    
    private final String filename = "funcionario.dat";
    private List<Funcao> funcionarios = new ArrayList<Funcao>();
    
    private void salvarArquivo(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(funcionarios);
            oos.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(AgenciaDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadArquivo(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            funcionarios = (List<Funcao>) ois.readObject();
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
    public void inserir(Funcao codigo) {
        loadArquivo();
        boolean existe = false;
        
        for (Funcao c : funcionarios) {
            if(c.getCodigo() == codigo.getCodigo()){
                existe = true;
                break;
            }
        }
        if(!existe){
            funcionarios.add(codigo);
            salvarArquivo();
            System.out.println("Funcionário cadastrado com Sucesso!");
        }else{
            System.out.println("Funcionário já cadastrado!");
        }
    }

    @Override
    public void editar(Funcao codigo) {
        loadArquivo();
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcao c = funcionarios.get(i);
            if(c.getCodigo() == codigo.getCodigo()){
                funcionarios.set(i, codigo);
                salvarArquivo();
                break;
            }
        }
    }

    @Override
    public boolean remover(int Codigo) {
        loadArquivo();

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcao c = funcionarios.get(i);
            if(c.getCodigo() == Codigo){
                funcionarios.remove(i);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    @Override
    public Funcao getByCodigo(int Codigo) {
        loadArquivo();
        for (Funcao c : funcionarios) {
            if(c.getCodigo() == Codigo){
                return c;
            }
        }
        
        return null;
    }

    @Override
    public List<Funcao> listar() {
        loadArquivo();
        return funcionarios;
    }
    
}