package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", calc.PI);
        sc.close();
    }

   
}
