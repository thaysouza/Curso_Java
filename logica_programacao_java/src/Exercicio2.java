
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________");
        System.out.println("Código 1");
        System.out.println("Cachorro Quente ---- R$ 4.00");
        System.out.println("___________________________");
        System.out.println("Código 2");
        System.out.println("X-Salada ---- R$ 4.50");
        System.out.println("___________________________");
        System.out.println("Código 3");
        System.out.println("X-Bacon ---- R$ 5.00");
        System.out.println("___________________________");
        System.out.println("Código 4");
        System.out.println("Torrada Simples ---- R$ 2.00");
        System.out.println("___________________________");
        System.out.println("Código 5");
        System.out.println("Refrigerante ---- R$ 1.50");
        System.out.println("___________________________");
        System.out.println("\nInforme o codigo do seu pedido\n");
        int codigo = sc.nextInt();

        System.out.println("\nInforme a quantidade do produto\n");
        int qtd = sc.nextInt();

        double total = 0;

        if (codigo == 1) {
            total = qtd * 4.0;
        } else if (codigo == 2) {
            total = qtd * 4.5;
        } else if (codigo == 3) {
            total = qtd * 5.0;
        } else if (codigo == 4) {
            total = qtd * 2.0;
        } else if (codigo == 5) {
            total = qtd * 1.5;

        } else {
            System.out.println("Código Inválido");
        }
        System.out.printf("\nValor da compra: R$ %.2f%n", total);

        sc.close();
    }
}
