//Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.

public class Exercicio1 {
    public static int Soma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + Soma(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Soma(5));
    }
}
