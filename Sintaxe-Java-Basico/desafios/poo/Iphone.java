package desafios.poo;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar(String numero) {
        System.out.println("9276024312");
    }

    @Override
    public void atender() {
        System.out.println("Numero Ligando");
    }

    @Override
    public void enviarMensagem(String numero) {
        System.out.println("9276524312");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página web");
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {

    }

}
