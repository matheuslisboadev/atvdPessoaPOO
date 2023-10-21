import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Jogador> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Jogador jogador) {
        contatos.add(jogador);
    }

    public Jogador buscarPorNome(String nome) {
        for (Jogador jogador : contatos) {
            if (jogador.getNome().equals(nome)) {
                return jogador;
            }
        }
        return null;
    }

    public List<Jogador> buscarPorTime(String time) {
        List<Jogador> jogadoresEncontrados = new ArrayList<>();
        for (Jogador jogador : contatos) {
            if (jogador.getTime().equalsIgnoreCase(time)) {
                jogadoresEncontrados.add(jogador);
            }
        }
        return jogadoresEncontrados;
    }

    public void mostrarContatos() {
        System.out.println("Lista de Jogadores:");
        for (Jogador jogador : contatos) {
            System.out.println(jogador.toString());
            System.out.println("-----------");
        }
    }
}
