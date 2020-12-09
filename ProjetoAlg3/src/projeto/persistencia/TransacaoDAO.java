package projeto.persistencia;
import java.util.List;
import projeto.entidades.Transacao;

/**
 *
 * @author guih5
 */
public interface TransacaoDAO {
    public void inserir(Transacao tr);

    public void editar(Transacao tr);

    public boolean remover(int CPF);

    public Transacao getByCPF(int CPF);

    public List<Transacao> listar();

}