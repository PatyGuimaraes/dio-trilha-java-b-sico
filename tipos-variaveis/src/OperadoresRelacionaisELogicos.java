
public class OperadoresRelacionaisELogicos {
    public static void main(String[] args) {
        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 == numero2)
        System.out.println("Número 1 igual ao número 2 ");

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        //para objetos temos que usar a função equals, exemplo:
        String nomeUm = "PATRICIA"    ;
        String nomeDois = new String("PATRICIA");

        System.out.println(nomeUm.equals(nomeDois));

        // Expressões lógicas
        boolean condicao1 = true;
        boolean condicao2 = false;
         if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
         }
         if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
         }
    }

}
