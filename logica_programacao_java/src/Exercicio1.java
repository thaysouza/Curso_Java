
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um numero ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " é negativo");
        } else {
            System.out.println(num + " é positivo");
        }

        sc.close();

    }
}
