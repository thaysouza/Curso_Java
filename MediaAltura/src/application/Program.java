
package application;

import java.util.Scanner;
import java.util.Locale;
public class Program {
     public static void main(String[] args){
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Informe o tamanho do array");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        
        double soma = 0.0;
        for (int i=0; i<n; i++){
            System.out.println("Informe o valor para a posição " + i );
            vetor[i] = sc.nextDouble();
             soma += vetor[i];
        }
        double result = soma / n;
        
        System.out.println("Media das alturas: " + result);
       
          
        sc.close();
     }
}
