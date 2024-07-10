package orientada_objectos.pilares_oop.apps;

//Essa classe usa a herança da classe ServicoMensagemInstantane
public class MSNMessager extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
