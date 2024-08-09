package com.iphonecomponent;

public class Application {
	
	public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        player.selecionarMusica("Minha Música Favorita");
        player.tocar();
        player.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("http://example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
	
}
