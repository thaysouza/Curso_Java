package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Empregado;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();

        System.out.println("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Empregado emp = new Empregado(id, nome, salario);

            lista.add(emp);
        }

        System.out.println("Informe o Id do funcionario que terá o salário incrementado: ");
        int idsalario = sc.nextInt();
        Integer pos = idPosition(lista,idsalario);
        if(pos == null){
            System.out.println("Esse id não existe! ");
        }else{
            System.out.println("Informe a porcentagem para incrementar no sálario ");
            double porcentagem = sc.nextDouble();
            lista.get(pos).IncrementarSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de empregados: ");
        for(Empregado emp : lista){
            System.out.println(emp);
        }
        
        
        
        sc.close();
    }

    //retorna  a posição do funcionario na lista
    public static Integer idPosition(List<Empregado> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;

            }
        }

        return null;
    }

}
