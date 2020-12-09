package projeto.persistencia.arquivo;

import projeto.entidades.Transacao;
import projeto.persistencia.TransacaoDAO;
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

public class TransacaoDAOImplArq implements TransacaoDAO{

    private final String filename = "trams.dat";
    private List<Transacao> transacao = new ArrayList<Transacao>();

    private void salvarArquivo(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(transacao);
            oos.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            Logger.getLogger(ClienteDAOImplArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadArquivo(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            transacao = (List<Transacao>) ois.readObject();
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
    public void inserir(Transacao t) {
        loadArquivo();
        boolean existe = false;

        for (Transacao tt : transacao) {
            if(tt.getCPF() == t.getCPF()){
                existe = true;
                break;
            }
        }
        if(!existe){
            transacao.add(t);
            salvarArquivo();
            System.out.println("Agencia cadastrado com Sucesso!");
        }else{
            System.out.println("Agencia já cadastrado!");
        }
    }

    @Override
    public void editar(Transacao t) {
        loadArquivo();
        for (int i = 0; i < transacao.size(); i++) {
            Transacao tt = transacao.get(i);
            if(tt.getCPF() == t.getCPF()){
                transacao.set(i, tt);
                salvarArquivo();
                break;
            }
        }
    }

    @Override
    public boolean remover(int CPF) {
        loadArquivo();

        for (int i = 0; i < transacao.size(); i++) {
            Transacao tt = transacao.get(i);
            if(tt.getCPF() == CPF){
                transacao.remove(i);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    @Override
    public Transacao getByCPF(int CPF) {
        loadArquivo();
        for (Transacao tt : transacao) {
            if(tt.getCPF() == CPF){
                return tt;
            }
        }

        return null;
    }

    @Override
    public List<Transacao> listar() {
        loadArquivo();
        return transacao;
    }

}