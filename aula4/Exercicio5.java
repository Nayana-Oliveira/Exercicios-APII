//Faça uma função recursiva que receba um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem crescente.

public class Exercicio5 {
    public static void imprimeNaturais(int n) {

        if (n == 0) {
            System.out.print(0 + " ");
            return;
        }
        imprimeNaturais(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        imprimeNaturais(n);
    }
}
