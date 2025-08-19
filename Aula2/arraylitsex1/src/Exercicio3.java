import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        // Criando o ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando os números
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Verificando se o número 3 está presente
        if (numeros.contains(3)) {
            System.out.println("O número 3 está presente no ArrayList!");
        } else {
            System.out.println("O número 3 NÃO está presente no ArrayList.");
        }
    }
}
