package controle_fluxo.estruturas_condicionais;


public class SistemaMedia {

    //Este é um cenário de Switch case que não traz tantos benefícios
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }


    }
}
