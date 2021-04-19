package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Thay");
        lista.add("Alicia");
        lista.add("Tamires");
        lista.add("Maria");
        lista.add("Amanda");
        lista.add(2, "Tauan");

        System.out.println(lista.size());

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("_______________");
        //lista.remove("Tauan");
        //lista.remove(0);
        //pegar um valor x do tipo string e retorna se o x.charAt(0) é igual a T
        lista.removeIf(x -> x.charAt(0) == 'T');
        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("_______________");
        System.out.println("Index of Alicia: " + lista.indexOf("Alicia")); // retorna a posição

        //filtrar a lista com todos que começam com A
        System.out.println("_______________");
        //converter para stream, fazer a operação lambda e voltar para lista
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        //encontrar o primeiro elemento que começa com a letra A
        System.out.println("_______________");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
