public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(12);
        System.out.println("Canal atual : " + smartTv.canal);

        
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        
        System.out.println("Volume Atual : " + smartTv.volume);


    }
}
