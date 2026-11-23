package edu.ryan.ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o número da Agência da conta: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        Conta conta = new Conta(titular, numeroConta, numeroAgencia);
        conta.depositar(saldoInicial);

        System.out.print("Olá, " + titular + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + conta.getSaldo() + " já está disponível para saque." + "\n");

        

        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Número da Agência: " + conta.getNumeroAgencia());
        System.out.println("Saldo Atual: R$" + conta.getSaldo());

        scanner.close();
    }
}
