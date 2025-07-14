package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import interfaces.ReprodutorVideo;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, ReprodutorVideo, NavegadorInternet {




    // Implementação dos métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos do Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    // Implementação dos métodos do Reprodutor de Vídeo
    @Override
    public void reproduzirVideo(String video) {
        System.out.println("Reproduzindo vídeo: " + video);
    }

    @Override
    public void pausarVideo() {
        System.out.println("Vídeo pausado");
    }

    @Override
    public void ajustarVolume(int nivel) {
        System.out.println("Volume ajustado para: " + nivel);
    }
}
