public class Operadores {
    public static void main(String[] args) {

        String nomeUm = "IAN";
        String nomeDois = new String ("IAN");

        System.out.println(nomeUm.equals(nomeDois));
        

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) {
            System.out.println("a nossa condicao é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        /*
         * int a, b;
         * a = 6;
         * b = 6;
         * 
         * int resultado = a == b ? 1 : 0;
         * 
         * System.out.println(resultado);
         */

        /*
         * String nome = "Ian Cunha";
         * int idade = 24;
         * double peso = 60.5;
         * char sexo = 'M';
         * boolean doadorOrgao = true;
         * Date dataNascimento = new Date();
         */

        // Concatenacao
        // String linguagem = "LINGUAGEM " + "JAVA";
        // System.out.println(linguagem);

        /*
         * int numero = 5;
         * numero = - numero;
         * System.out.println(numero);
         * numero = numero * -1;
         * System.out.println(numero);
         */

        /*
         * 
         * int numero = 5;
         * 
         * // x repeticao
         * 
         * // numero = numero +1;
         * 
         * System.out.println(numero++);
         * 
         * System.out.println(numero);
         */

        /*
         * boolean variavel = true;
         * 
         * variavel = !variavel;
         * 
         * System.out.println(variavel);
         */
    }
}
