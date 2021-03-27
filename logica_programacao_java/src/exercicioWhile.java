
import java.util.Scanner;

public class exercicioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua senha");
        int senha = sc.nextInt();
        int soma = 0;
        int tentativa = 3;

        while ((senha != 2002) && (tentativa >= 1)) {
            tentativa -= 1;
            System.out.println("Senha Invalida");
            System.out.println("Voce tem " + tentativa + " tentativa(s) restante(s)");
            System.out.println("_______________________________________");
            System.out.println("Informe sua senha");
            senha = sc.nextInt();

            if (tentativa == 0) {
                System.out.println("Acesso negado");
            }
        }

        if (senha == 2002) {
            System.out.println("Acesso Permitido");
        }
        sc.close();
    }
}
