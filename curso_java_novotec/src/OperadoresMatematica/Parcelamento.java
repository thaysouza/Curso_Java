package OperadoresMatematica;

public class Parcelamento {

    public static void main(String[] args) {
        double valorTelevisao = 3500.00d;
        double valorTotal = (valorTelevisao + (valorTelevisao * 10) / 100) + 50;
        double valorMensal = valorTotal / 6;
        
        System.out.println("O valor total da compra é: " + valorTotal);
        System.out.println("O valor mensal da compra é: " + valorMensal);
    }
}




