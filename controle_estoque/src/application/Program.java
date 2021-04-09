
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
        System.out.println("Quantidade no estoque: ");
        int quantidade = sc.nextInt();
         Product product = new Product(nome, preco, quantidade);
        
   
        
       /* System.out.println("Dados do estoque");
        System.out.println("-------------------------");
        System.out.println("Nome do produto: "+ product.nome);
        System.out.println("Preço do produto: "+ product.preco );
        System.out.println("qtd de produtos: "+ product.quantidade);*/
        

       System.out.println();
       System.out.print("Informe o numero de produtos para serem adicionados no estoque: ");
       quantidade = sc.nextInt();
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
