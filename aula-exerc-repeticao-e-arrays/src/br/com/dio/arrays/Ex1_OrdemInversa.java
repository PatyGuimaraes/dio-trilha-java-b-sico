package br.com.dio.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {6, 9, 3, 4, 10, 7};

        System.out.println("Quantidade de elementos no vetor: " + vetor.length);

        int count = 0;
        System.out.println("Vetor em ordem:");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor ordem inversa: ");
        // mostrar elementos em ordem inversa
        for(int i = (vetor.length -1) ; i >=0 ; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
