
package OperadoresMatematica;

public class Salario {
  public static void main(String[] args){
     
      double preco = 180.00d;
      double desconto = 0.20d;
      double valorFinal = 0;
      
      valorFinal = preco - (preco * desconto);
      
      System.out.println("O valor do salario com desconto é: " + valorFinal);
  }  
}
