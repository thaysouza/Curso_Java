package entities;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;
    
    public Product(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalNoEstoque() {
        return preco * quantidade;
    }

    //this é usado para autoreferenciar o objeto, assim não acessamos 
    //o parametro do metodo que tem o msm nome do atributo da classe 
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "\n----- Estoque ----\n---------------------\nNome do produto: " + nome
                + "\nPreco: R$ " + String.format("%.2f", preco)
                + "\nQuantidade: " + quantidade + " unidades \n"
                + "Valor Total: R$ " + String.format("%.2f", valorTotalNoEstoque());
        
    }
}
