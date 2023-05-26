package entity;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
