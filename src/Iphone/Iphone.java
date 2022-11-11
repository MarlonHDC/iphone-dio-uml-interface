package Iphone;

import Iphone.internet.NavegadorInternet;
import Iphone.ipod.Ipod;
import Iphone.telefone.AppTelefonico;

public class Iphone implements NavegadorInternet, Ipod, AppTelefonico {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba no Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via Iphone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");

    }

    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação no Iphone");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação no Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");

    }
}
