package OperadoresMatematica;

import java.util.Locale;
import java.util.Scanner;

public class NotaAlunos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota da primeira prova: ");
        double prova1 = sc.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        double prova2 = sc.nextDouble();
        System.out.println("Informe a nota da terceira prova: ");
        double trabalho = sc.nextDouble();

        double result = ((prova1 * 3) + (prova2 * 5) + (trabalho * 2)) / 10;

        System.out.printf("A média do aluno é: " + result);
    }
}
