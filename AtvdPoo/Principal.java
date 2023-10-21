public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Jogador jogador1 = new Jogador("LeBron James", 36, "Los Angeles Lakers", "Ala-Pivô", 2500);
        Jogador jogador2 = new Jogador("Stephen Curry", 33, "Golden State Warriors", "Armador", 2200);

        agenda.adicionarContato(jogador1);
        agenda.adicionarContato(jogador2);

        Jogador jogadorEncontrado = agenda.buscarPorNome("Stephen Curry");

        if (jogadorEncontrado != null) {
            System.out.println("Jogador encontrado:\n" + jogadorEncontrado);
        } else {
            System.out.println("Jogador não encontrado.");
        }

        System.out.println("----------------------------------------");

        List<Jogador> jogadoresDoLakers = agenda.buscarPorTime("Los Angeles Lakers");

        System.out.println("Jogadores do Los Angeles Lakers:");
        for (Jogador jogador : jogadoresDoLakers) {
            System.out.println(jogador);
        }

        agenda.mostrarContatos();
    }
}
