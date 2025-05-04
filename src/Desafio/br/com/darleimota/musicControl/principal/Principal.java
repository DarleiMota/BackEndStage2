package Desafio.br.com.darleimota.musicControl.principal;

import Desafio.br.com.darleimota.musicControl.modelos.AudioLivro;
import Desafio.br.com.darleimota.musicControl.modelos.Musica;
import Desafio.br.com.darleimota.musicControl.modelos.Palestra;
import Desafio.br.com.darleimota.musicControl.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica(
                "A Maldição de Eldora",
                240,
                "Darlei & The Coders",
                "Trilha de Aventuras",
                "Fantasy RPG"
        );

        musica.reproduzir();
        musica.reproduzir();
        musica.curtir();
        musica.classificar(10);
        musica.classificar(8);

        musica.exibirInformacoes();

        System.out.println(" ");

        Podcast podcast = new Podcast(
                "A Jornada dos Coders",
                1800,
                "Darlei & The Coders",
                "Neste episódio, discutimos as últimas tendências de programação.",
                "Episódio 5 - Tecnologias Emergentes",
                "Convidado: Maria Developer"
        );

        podcast.reproduzir();
        podcast.reproduzir();
        podcast.curtir();
        podcast.classificar(9);
        podcast.classificar(8);
        podcast.exibirInformacoes();

        System.out.println(" ");

        AudioLivro audioLivro = new AudioLivro(
                "A Maldição de Eldora - O Audiolivro",
                5400,
                "Darlei Mota",
                "Editora Fictícia",
                "Fantasia",
                "Carlos Silva"
        );

        audioLivro.reproduzir();
        audioLivro.reproduzir();
        audioLivro.curtir();
        audioLivro.classificar(9);
        audioLivro.classificar(7);
        audioLivro.exibirInformacoes();

        System.out.println(" ");


        Palestra palestra = new Palestra(
                "Inovações em TI para o Futuro",
                3600,
                "Dr. João Silva",
                "Tech Conference 2025",
                "Tecnologia e Inovação",
                "Brasília, Brasil"
        );

        palestra.reproduzir();
        palestra.curtir();
        palestra.classificar(9);
        palestra.classificar(8);
        palestra.exibirInformacoes();
    }
}


