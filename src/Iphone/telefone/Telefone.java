package Iphone.telefone;

public class Telefone implements AppTelefonico{
    @Override
    public void ligar() {
        System.out.println("Iniciando uma ligação no App Telefônio");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo App Telefônio");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz App Telefônio");
    }
}
