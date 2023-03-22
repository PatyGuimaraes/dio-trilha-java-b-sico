import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        int nota = 0;

        do {
            System.out.println("Digite uma nota de 0 a 10:");
            nota = scan.nextInt();

        } while (nota < 0 || nota > 10);
        System.out.println("Sua nota foi: " + nota);
        scan.close();

        /* Também pode ser feito assim:
         * while(true) {
         * System.out.print("Digite uma nota de 0 a 10: ");
         * double nota = scan.nextInt();
         *  if (nota < 0 || nota > 10){
         *  continue;
         *  } else {
         *  System.out.println("Sua nota foi " + nota);
         *   break;
         *  }
         * }
         */

    }
}
