//Faça uma função recursiva que receba um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem decrescente.

public class Exercicio6 {
    public static void imprimeDecrescente(int n) {

        System.out.print(n + " ");

        if (n == 0) {
            return;
        }

        imprimeDecrescente(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        imprimeDecrescente(n);
    }
}
