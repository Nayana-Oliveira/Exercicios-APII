package segundo_semestre.java.Aula9.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercicio {
    public static void chaveCustomizada() {
        Map<Produto, Integer> estoque = new HashMap<>();

        Produto p1 = new Produto(101, "Prego");
        Produto p2 = new Produto(102, "Parafuso");
        Produto p3 = new Produto(103, "Porca");

        estoque.put(p1, 50);
        estoque.put(p2, 30);
        estoque.put(p3, 70);

        System.out.println("--- Estoque inicial ---");
        for (Map.Entry<Produto, Integer> item : estoque.entrySet()) {
            System.out.println(item.getKey().getNome() + " (ID " + item.getKey().getId() + "): " + item.getValue());
        }
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o ID do produto que deseja remover: ");
        int idBusca = scanner.nextInt();

        while (idBusca != p1.getId() && idBusca != p2.getId() && idBusca != p3.getId()) {
            System.out.println("ID inválido!");
            System.out.println("Digite o ID do produto que deseja remover corretamente: ");
            idBusca = scanner.nextInt();
        }

        System.out.println("Digite a quantidade que deseja remover: ");
        int qtdRemover = scanner.nextInt();

        Produto busca = new Produto(idBusca, "");

        if (estoque.containsKey(busca)) {
            int qtdAtual = estoque.get(busca);

            while (qtdRemover > qtdAtual) {
                System.out.println("Quantidade a remover é maior que o estoque disponível!");
                System.out.println("Digite a quantidade que deseja remover corretamente: ");
                qtdRemover = scanner.nextInt();
            }
            estoque.put(busca, qtdAtual - qtdRemover);
        }

        System.out.println("--- Estoque atualizado ---");
        for (Map.Entry<Produto, Integer> item : estoque.entrySet()) {
            System.out.println(item.getKey().getNome() + " (ID " + item.getKey().getId() + "): " + item.getValue());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        chaveCustomizada();
    }
}