import java.util.Scanner;
public class praticaFor {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Qual tatuaba voce quer fazer ?");
        int valor = sc.nextInt();
        int total;
        
        for (int i = 0; i < 11; i++) {
            total = valor * i;
            System.out.println(valor + " X " + i + " = " + total);
        }
    }

}
