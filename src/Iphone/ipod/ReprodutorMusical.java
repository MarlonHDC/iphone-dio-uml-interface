package Iphone.ipod;

public class ReprodutorMusical implements Ipod{
    @Override
    public void tocar() {
        System.out.println("Tocando música no Reprodutor Musical");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no Reprodutor Musical");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Reprodutor Musical");
    }
}
