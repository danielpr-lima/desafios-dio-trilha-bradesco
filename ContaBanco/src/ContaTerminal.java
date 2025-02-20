import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o numero da conta: ");
        numeroConta = input.nextInt();
        input.nextLine();

        System.out.println("Digite o numero da agencia: ");
        agencia = input.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
