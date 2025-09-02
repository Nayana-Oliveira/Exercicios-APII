//Faça uma função recursiva que calcule e retorne o Enésimo termo da sequência
//Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

public class Exercicio3 {

    public static long fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fib(i));
        }
    }
}
