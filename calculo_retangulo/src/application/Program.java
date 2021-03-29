
package application;
import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangulo valor = new Retangulo();

        System.out.println("Informe a largura e altura do Retangulo: ");
        valor.width = sc.nextDouble();
        valor.height = sc.nextDouble();
        
        System.out.printf("AREA = %.2f%n", valor.area());
        System.out.printf("PERIMETER = %.2f%n", valor.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", valor.diagonal());
        sc.close();
    }
}
