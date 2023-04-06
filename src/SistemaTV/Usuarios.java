package SistemaTV;

public class Usuarios {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal atual: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " +smartTv.canal);

        System.out.println("Tv liga ?  :" + smartTv.ligada);
        System.out.println("Canal Atual? :" + smartTv.canal);
        System.out.println("Volume Atual ? :" + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status -> Tv liga ?  : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> Tv liga ?  : " + smartTv.ligada);

    }


}
