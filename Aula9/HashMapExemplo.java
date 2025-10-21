package segundo_semestre.java.Aula9.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemplo {

    public static void dicionarioSinonimos() {
        Map<String, String> sinonimos = new HashMap<>();

        sinonimos.put("rápido", "ligeiro");
        sinonimos.put("bonito", "belo");
        sinonimos.put("grande", "imenso");

        String sinonimoBonito = sinonimos.get("bonito");
        System.out.println("Sinônimo de bonito: " + sinonimoBonito);

        sinonimos.remove("rápido");
        System.out.println("Map após remoção: " + sinonimos);

        if (sinonimos.containsKey("grande")) {
            System.out.println("A chave 'grande' existe!");
        }
    }

    public static void iteracaoHashMap() {
        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("Parafuso", 1500);
        inventario.put("Porcas", 1200);
        inventario.put("Pregos", 1000);

        System.out.println("\n--- Iterando sobre o inventário ---");

        for (Map.Entry<String, Integer> item : inventario.entrySet()) {
            System.out.println("Item: " + item.getKey() + ", Quantidade: " + item.getValue() + "");
        }
    }

    public static void contagemFrequencia() {
        String texto = "abracadabra";
        Map<Character, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (frequencia.containsKey(caracter)) {
                int contagemAtual = frequencia.get(caracter);
                frequencia.put(caracter, contagemAtual + 1);
            } else {
                frequencia.put(caracter, 1);
            }
        }

        System.out.println("\n--- Frequência de caracteres ---");
        for (Map.Entry<Character, Integer> entrada : frequencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        System.out.println();
    }

    public static void chaveCustomizada() {
        Map<Produto, Integer> estoque = new HashMap<>();

        Produto p1 = new Produto(101, "Prego");
        estoque.put(p1, 50);

        Produto busca = new Produto(101, "Prego");

        Integer quantidade = estoque.get(busca);
        System.out.println("Quantidade produto ID 101: " + quantidade);
    }

    public static void main() {
        dicionarioSinonimos();
        iteracaoHashMap();
        contagemFrequencia();
        chaveCustomizada();
    }
}