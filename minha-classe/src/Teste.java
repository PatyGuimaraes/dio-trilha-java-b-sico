public class Teste {
    public static void main(String[] args) {
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2);

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3);

        String nome4 = nome3;
        System.out.println(nome4 == nome3);

        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    }
}
