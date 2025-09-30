import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre 5 números para a FILA:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            fila.add(sc.nextInt());
        }

        System.out.println("\nCadastre 5 números para a PILHA:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            pilha.push(sc.nextInt());
        }

        System.out.println("\n1) Números nas duas estruturas:");
        for (int num : fila) {
            if (pilha.contains(num)) {
                System.out.println(num);
            }
        }

        System.out.println("\n2) Números da FILA:");
        System.out.println(fila);

        System.out.println("\n3) Números da PILHA:");
        System.out.println(pilha);
    }
}
