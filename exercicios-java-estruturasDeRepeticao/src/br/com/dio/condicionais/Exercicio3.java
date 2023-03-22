import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */



public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.println("Digite seu nome:");
            nome = scan.next();
        }while(nome.length()<= 3);

        do{
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
        }while(idade < 0 && idade > 150);

        do{
            System.out.println("Digite seu salário:");
            salario = scan.nextDouble();
        }while(salario < 0);

        do{
            System.out.println("Informe seu sexo - F para feminino e M para masculino:");
            sexo = scan.next();
        }while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));


        scan.close();
    }
}
