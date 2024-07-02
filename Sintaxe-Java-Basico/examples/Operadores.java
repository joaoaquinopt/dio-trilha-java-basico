package examples;

import java.util.Date;

public class Operadores {

    public static void main(String[] args) {


/*
        // Atribuição = "="
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Aritmeticos =  + (adição), - (subtração), * (multiplicação) e / (divisão)
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
 */



        //classe Operadores.java
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(-numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);




        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
           resultado = "true";
        else
           resultado = "false";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //String resultado = (a==b) ? 1 : 0;
        String resultado = (a==b) ? "true" : "false";
        System.out.println(resultado);

        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");


        // ComparacaoAvancada.java
            String nome1 = "JAVA";
            String nome2 = "JAVA";

            System.out.println(nome1 == nome2); //true

            String nome3 = new String("JAVA");

            System.out.println(nome1 == nome3); //false

            String nome4 = nome3;

            System.out.println(nome3 == nome4); //true

            //equals na parada
            System.out.println(nome1.equals(nome2)); //??
            System.out.println(nome2.equals(nome3)); //??
            System.out.println(nome3.equals(nome4)); //??


        // OperadoresLogicos.java
        boolean condicao1 = true;

        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
        expressões.
        É como se estivesse escrito:
         "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        /*
        int numero3 = 1;
        int numero4 = 1;

        if(numero3== 2 & numero4 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");
        */

    }
}
