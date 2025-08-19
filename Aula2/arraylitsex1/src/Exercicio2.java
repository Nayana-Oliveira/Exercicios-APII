import java.util.ArrayList;
import java.util.Arrays;
public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(nomes.toString());
        nomes.add("Ana");
        System.out.println(nomes.toString());
        nomes.add("Joao");
        System.out.println(nomes.toString());
        nomes.add("Maria");
        System.out.println(nomes.toString());

        nomes.remove("João");
        System.out.println(nomes.toString());

        System.out.println("=== Outra Opção ===");

        ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Ana", "João", "Maria"));
        System.out.println(nomes2.toString());

        nomes2.remove("Joao");
        System.out.println(nomes2.toString());
    }
}
