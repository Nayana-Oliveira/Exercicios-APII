//Escreva uma função recursiva que calcule a soma dos primeiros n cubos:
//𝑆(𝑛) = 13 + 23 + ⋯ + 𝑛3

public class Exercicio2 {
    public static int soma(int n) {
        if (n == 0) {
            return 0;
        }
        return n * n * n + soma(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(soma(1));
    }
}

