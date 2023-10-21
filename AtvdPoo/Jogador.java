public class Jogador {
    private String nome;
    private int idade;
    private String time;
    private String posicao;
    private int pontos;

    public Jogador(String nome, int idade, String time, String posicao, int pontos) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
        this.posicao = posicao;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nTime: %s\nPosição: %s\nPontos: %d",
                nome, idade, time, posicao, pontos);
    }
}
