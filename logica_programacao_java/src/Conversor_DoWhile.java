
import java.util.Locale;
import java.util.Scanner;

public class Conversor_DoWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("Digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

            System.out.print("Deseja continuar (s/n)? ");
            resposta = sc.next().charAt(0);

        } while (resposta != 'n');
        sc.close();
    }
}
