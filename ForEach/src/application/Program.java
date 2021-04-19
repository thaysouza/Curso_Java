
package application;


public class Program {
     public static void main(String[] args){
         String[] vetor = new String[] {"maria", "thay", "alicia"};
         
         for (int i = 0; i<vetor.length; i++){
             System.out.println(vetor[i]);
         }
         
         System.out.println("____________________");
         
         //para cada Objeto obj contido no vetor "vetor" faça
         for(String obj : vetor){
             System.out.println(obj);
         }
     }
}
