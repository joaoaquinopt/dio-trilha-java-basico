package controle_fluxo.estruturas_repeticao;

public class FormartadorCEP {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2523256225");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
