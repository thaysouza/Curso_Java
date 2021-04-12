package application;

import entidade.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Informe o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("existe um depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Informe o valor do deposito? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Informe o valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Informe o valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();

    }
}
