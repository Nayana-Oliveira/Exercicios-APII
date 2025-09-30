import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);

        System.out.println("Fila: " + fila);

        System.out.println("Primeiro da fila: " + fila.peek());

        int removido = fila.remove();
        System.out.println("Elemento removido: " + removido);

        System.out.println("Fila após remoção: " + fila);
    }
}
