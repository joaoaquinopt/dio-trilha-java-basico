package orientada_objectos.pilares_oop;

import orientada_objectos.pilares_oop.apps.FacebookMessager;
import orientada_objectos.pilares_oop.apps.MSNMessager;
import orientada_objectos.pilares_oop.apps.ServicoMensagemInstantanea;
import orientada_objectos.pilares_oop.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="???";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessager();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessager();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
