import entity.Music;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Music music = new Music();

        music.setAlbum("Depois da Guerra");
        music.setArtista("Oficina G3");
        music.setDuracao(60);
        music.setGenero("Rock");
        music.curtir();
        music.curtir();
        music.curtir();
        music.curtir();
        music.curtir();
        music.curtir();
        music.curtir();
        music.curtir();
        
        music.reproduzir();
        music.reproduzir();
        music.reproduzir();
        music.reproduzir();
        music.reproduzir();

        music.getAlbum();
        music.getTotalCurtidas();
        music.getTotalDeReproducoes();

        System.out.println("O album da música: " + music.getAlbum() + " Total de Curtidas: " + music.getTotalCurtidas() +
                " Total de reproduções: " + music.getTotalDeReproducoes());

    }
}
