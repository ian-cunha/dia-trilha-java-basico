import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int Conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double Saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                        + ", conta " + Conta + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
