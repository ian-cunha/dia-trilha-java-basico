public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice de elementos inicia em ZERO
        String alunos[] = { "Ian", "Ivanise", "Maria", "Pedro", "Ana" };

        for (String aluno : alunos) {
            System.out.println("Nome do aluno(a) é: " + aluno);
        }
    }
}
