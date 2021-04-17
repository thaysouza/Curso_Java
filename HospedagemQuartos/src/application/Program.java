package application;

import java.text.ParseException;
import java.util.Scanner;
import entities.Alugar;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Alugar[] vetor = new Alugar[10];
        System.out.print("Quantos quartos deseja? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Posição " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Alugar(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        sc.close();
    }
}
