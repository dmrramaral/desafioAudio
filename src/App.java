import entity.Music;
import entity.PodCasts;

public class App {

    public static void main(String[] args) throws Exception {

        Music music = new Music();

        music.setAlbum("Depois da Guerra");
        music.setArtista("Oficina G3");
        music.setDuracao(60);
        music.setGenero("Rock");

        PodCasts casts = new PodCasts();
        casts.setTitulo("hipster.tech");
        casts.setDescricao("O podCast de tecnologias e outras modinhas");

        for (int index = 0; index < 1000; index++) {
            music.reproduzir();
            casts.reproduzir();
        }

        for (int i = 0; i < 5000; i++) {
            casts.curtir();
            music.curtir();
        }

        System.out.println(
                "O album da música: " + music.getAlbum() + "\n Total de Curtidas: " + music.getTotalCurtidas() +
                        "\n Total de reproduções: " + music.getTotalDeReproducoes()
                        + "\n A classificação é de :" + music.getClassificacao());

        System.out.println("O Podcast: " + casts.getTitulo() + "\n Total de Curtidas: " + casts.getTotalCurtidas() +
                "\n Total de reproduções: " + casts.getTotalDeReproducoes()
                + "\n A classificação é de :" + casts.getClassificacao());
    }
}
