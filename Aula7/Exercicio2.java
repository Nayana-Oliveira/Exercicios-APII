import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 – Cadastrar número");
            System.out.println("2 – Mostrar números pares");
            System.out.println("3 – Excluir número");
            System.out.println("4 – Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite números (letra para parar):");
                    while (sc.hasNextInt()) {
                        pilha.push(sc.nextInt());
                    }
                    sc.next();
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Números pares na pilha:");
                        for (int num : pilha) {
                            if (num % 2 == 0) {
                                System.out.println(num);
                            }
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("Não há números para excluir.");
                    } else {
                        System.out.println("Número removido: " + pilha.pop());
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}
