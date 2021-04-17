package application;

import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a qtd de posições do array\n");
        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.printf("Informe o nome do produto\n");
            String name = sc.nextLine();
            System.out.printf("Informe o preço\n");
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
            soma += vetor[i].getPrice();
        }
        double media = soma / vetor.length;

        System.out.printf("Media do preço: %.2f%n", media);

        sc.close();
    }
}
