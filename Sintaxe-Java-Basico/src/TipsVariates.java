package src;

public class TipsVariates {

        public static void main(String[] args) {
            byte idade = 123; // -128 a 127
            short ano = 2021; // -32.768 a 32.767
            int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo -2.147.483.648 a 2.147.483.647
            long cpf = 98765432109L; // se começar com zero,talvez tenha que ser outro tipo -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
            float pi = 3.14F; // -3,4028E+38 a 3,4028E+38
            double salario = 1275.33; // -1,7976E + 308 a 1,7976E + 308

            final double VALOR_DE_PI = 3.14; //Usa a palavra final para representar um constante, e usa o nome em CAIXA_ALTA

            System.out.println(pi);
        }

}
