import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoricoReservas {

    private Map<Usuario, List<ReservaMemento>> historico = new HashMap<>();

    public void adicionarEstado(Usuario usuario, ReservaMemento memento) {
        if (!historico.containsKey(usuario)) {
            historico.put(usuario, new ArrayList<>());
        }
        historico.get(usuario).add(memento);
    }

    public void listarHistorico(Usuario usuario) {
        System.out.println("Histórico de Reservas para o usuário: " + usuario.getNome());
        List<ReservaMemento> mementos = historico.get(usuario);
        if (mementos != null && !mementos.isEmpty()) {
            for (ReservaMemento memento : mementos) {
                System.out.println(memento.getDescricao());
            }
        } else {
            System.out.println("Nenhum histórico encontrado para este usuário.");
        }
        System.out.println();
    }
}
