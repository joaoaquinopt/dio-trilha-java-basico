package orientada_objectos.pilares_oop.apps;

//Essa classe usa a herança da classe ServicoMensagemInstantane
public class FacebookMessager extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
