
import java.util.Scanner;

public class Funcao_MaiorNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe tres numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maiorValor = maximo(a,b,c); //chamada da funcao max
        
        mostrarResultado(maiorValor); // imprimi a msg na tela
        
        sc.close();
    }
    
    public static int maximo(int x, int y, int z){
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;

    }
    
    public static void mostrarResultado(int value){
          System.out.println("Maior valor = "+ value);
    }
}
