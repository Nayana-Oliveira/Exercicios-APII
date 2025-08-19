import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        List<String> ListaNomes = new ArrayList<>();

        ListaNomes = Arrays.asList(nomes);

        System.out.println(ListaNomes.toString());
    }
}