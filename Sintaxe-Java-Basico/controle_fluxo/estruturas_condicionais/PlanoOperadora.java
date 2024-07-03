package controle_fluxo.estruturas_condicionais;


public class PlanoOperadora {
    //Este cenário de switch case traz benefícios, como não é utilizado o break, ele faz de forma encadiada
    public static void main(String[] args) {
        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

