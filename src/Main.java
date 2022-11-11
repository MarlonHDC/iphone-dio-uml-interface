import Iphone.Iphone;
import Iphone.internet.Internet;
import Iphone.ipod.ReprodutorMusical;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        Internet internet = new Internet();

        iphone.atender();
        iphone.adicionarNovaAba();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.pausar();

        System.out.println("--------------------------------------------------------");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        System.out.println("--------------------------------------------------------");
        internet.adicionarNovaAba();
        internet.exibirPagina();
        internet.atualizarPagina();

    }
}
