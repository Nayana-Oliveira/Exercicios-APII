import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println("Pilha: " + pilha.toString());

        System.out.println("Elemento no topo: " + pilha.peek());

        int desempilhado = pilha.pop();

        System.out.println("Elemento desempilhado: " + desempilhado);

        if(pilha.empty()) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.println("A pilha não está vazia");
        }

        int elem = 30;
        int posicao = pilha.search(elem);
        if (posicao != -1) {
            System.out.println("Elemento " + elem + " na posição: " + posicao);
        } else {
            System.out.println("Elemento" + elem + " não encontrado");
        }

    }
}
