public class OperadorTernario {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //String resultado = (a == b) ? "verdadeiro" : "false";

        // PODE SER ASSIM TAMBÉM
        int resultado = (a == b) ? 1 : 0;

        System.out.println(resultado);
    }

}
