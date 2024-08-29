import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura dos dados

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando os dados do usuario
        System.out.println("Digite o número do cliente: ");
        conta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        scanner.nextLine();
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + "R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
