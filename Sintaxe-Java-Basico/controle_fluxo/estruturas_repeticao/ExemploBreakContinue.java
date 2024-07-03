package controle_fluxo.estruturas_repeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break;

            System.out.println(numero);
        }
        //Qual a saída no console ? 1 e 2

    }

    /*
    public static void main(String[] args) {

        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;

            System.out.println(numero);

        }
        //Qual a saída no console ? 1, 2, 4 e 5

    }
    */
}
