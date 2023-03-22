import java.util.Scanner;

/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println();

        String usuario;
        String senha;
        boolean validaInput = false;

        do{
            System.out.println("Digite o nome do usuário:");
            usuario = scan.next();
            System.out.println("Digite a senha:");
            senha = scan.next();

            if(senha.equalsIgnoreCase(usuario)){
                System.out.println("Senha inválida! Digite novamente.");
            }else{
                validaInput = true;
                System.out.println("Seja bem vindo "+ usuario);

            }
        }while(!validaInput);



        scan.close();
        
    }
}
