package projeto.persistencia.arquivo;

import projeto.entidades.Agencia;
import projeto.persistencia.AgenciaDAO;
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

public class AgenciaDAOImplArq implements AgenciaDAO {
    
    private final String filename = "agencia.dat";
    private List<Agencia> agencias = new ArrayList<Agencia>();
    
    private void salvarArquivo(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(agencias);
            oos.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(AgenciaDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadArquivo(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            agencias = (List<Agencia>) ois.readObject();
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
    public void inserir(Agencia ag) {
        loadArquivo();
        boolean existe = false;
        
        for (Agencia c : agencias) {
            if(c.getnumeroAg() == ag.getnumeroAg()){
                existe = true;
                break;
            }
        }
        if(!existe){
            agencias.add(ag);
            salvarArquivo();
            System.out.println("Agencia cadastrado com Sucesso!");
        }else{
            System.out.println("Agencia já cadastrado!");
        }
    }

    @Override
    public void editar(Agencia ag) {
        loadArquivo();
        for (int i = 0; i < agencias.size(); i++) {
            Agencia c = agencias.get(i);
            if(c.getnumeroAg() == ag.getnumeroAg()){
                agencias.set(i, ag);
                salvarArquivo();
                break;
            }
        }
    }

    @Override
    public boolean remover(int numeroAg) {
        loadArquivo();

        for (int i = 0; i < agencias.size(); i++) {
            Agencia c = agencias.get(i);
            if(c.getnumeroAg() == numeroAg){
                agencias.remove(i);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    @Override
    public Agencia getBynumeroAg(int numeroAg) {
        loadArquivo();
        for (Agencia c : agencias) {
            if(c.getnumeroAg() == numeroAg){
                return c;
            }
        }
        
        return null;
    }

    @Override
    public List<Agencia> listar() {
        loadArquivo();
        return agencias;
    }
    
}