import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BancoDeDados {
    private Map<String, Integer> estoque;

    public BancoDeDados() {
        estoque = new HashMap<>();
        estoque.put("Prego", 100);
    }

    public void adicionarItem(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            int atual = estoque.get(nome);
            estoque.put(nome, atual + quantidade);
        } else {
            estoque.put(nome, quantidade);
        }
        System.out.println(quantidade + " unidades de " + nome + " foram adicionadas ao estoque.");
    }

    public boolean retirarItem(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            int atual = estoque.get(nome);
            if (atual >= quantidade) {
                estoque.put(nome, atual - quantidade);
                System.out.println("Retirado " + quantidade + " unidades de " + nome + ".");
                return true;
            } else {
                System.out.println("Quantidade insuficiente em estoque! Temos apenas " + atual + " unidades.");
                return false;
            }
        } else {
            System.out.println("Produto não encontrado no estoque.");
            return false;
        }
    }

    public void exibirEstoque() {
        System.out.println("\n--- Estoque Atual ---");
        for (String produto : estoque.keySet()) {
            System.out.println(produto + ": " + estoque.get(produto) + " unidades");
        }
        System.out.println("---------------------\n");
    }
}

public class ExercicioLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();
        boolean executando = true;

        while (executando) {
            System.out.println("=== Loja de Pregos ===");
            System.out.println("1 - Adicionar pregos ao estoque");
            System.out.println("2 - Retirar pregos (venda)");
            System.out.println("3 - Ver estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade de pregos para adicionar: ");
                    int qtdAdicionar = scanner.nextInt();
                    banco.adicionarItem("Prego", qtdAdicionar);
                    break;

                case 2:
                    System.out.print("Informe a quantidade de pregos que deseja retirar: ");
                    int qtdRetirar = scanner.nextInt();
                    banco.retirarItem("Prego", qtdRetirar);
                    break;

                case 3:
                    banco.exibirEstoque();
                    break;

                case 4:
                    System.out.println("Saindo da loja...");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
