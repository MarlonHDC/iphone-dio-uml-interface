package Iphone.internet;

public class Internet implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Navegador de Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba no Navegador de Internet");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Navegador de Internet");

    }
}
