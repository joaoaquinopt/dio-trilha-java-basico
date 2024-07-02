package src;

public class Usuario {

    public static void  main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada : " + smartTV.ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);

        smartTV.mudarCanal(15);
        System.out.println("Novo Canal -- Canal Atual : " + smartTV.canal);

        smartTV.ligar();
        System.out.println("Novo Status -- TV Ligada : " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -- TV Ligada : " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo Volume -- Volume Atual : " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Novo Volume -- Volume Atual : " + smartTV.volume);


        smartTV.aumentarCanal();
        System.out.println("A TV está no canal 15 e vai aumentar 1 : " + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("A TV está no canal 16 e vai diminuir 1 : " + smartTV.canal);



    }
}
