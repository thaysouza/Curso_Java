
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Informe os dados do Produto: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
     
         Product product = new Product(nome, preco);
         
        product.setNome("Computador");
        System.out.println("Nome atualizado "+ product.getNome());
        
        product.setPreco(120);
        System.out.println("Preco atualizado "+ product.getPreco());
        
        
       System.out.println();
       System.out.println("Dados atualizados "+ product);

       System.out.println();
       System.out.print("Informe o numero de produtos para serem adicionados no estoque: ");
       int quantidade = sc.nextInt();
       product.addProdutos(quantidade);
       
       System.out.println();
       System.out.println("Dados atualizados "+ product);
       
       
       System.out.println();
       System.out.print("Informe o numero de produtos para serem retirados do estoque: ");
       quantidade = sc.nextInt();
       product.removerProdutos(quantidade);
       
       
       System.out.println();
       System.out.println("Dados atualizados "+ product);
       
        sc.close();
    }
}
