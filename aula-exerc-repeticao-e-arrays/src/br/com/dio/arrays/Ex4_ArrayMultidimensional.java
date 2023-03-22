package br.com.dio.arrays;
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();// para criar números aleatórios

        int[][] M = new int[4][4];
        //for para navegar na matriz geral    
        for(int i = 0; i < M.length; i++){  // i representa a linha
            for(int j = 0; j < M[i].length; j++){ // j representa a coluna
                M[i][j] = random.nextInt(9); // até o número 9
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) { // pegou a linha
            for (int coluna : linha) { // cada elemento da coluna
                System.out.print(coluna + " ");
                
            }
            System.out.println(); // para pular linha e voltar no for para imprimir outra linha
        }
    }
}
