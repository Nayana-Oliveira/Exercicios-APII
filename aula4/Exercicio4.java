//A multiplicação de dois números inteiros pode ser feita através de somas sucessivas. Proponha um algoritmo recursivo Multip_Rec(n1,n2) que calcule a multiplicação de dois
//inteiros.

public class Exercicio4 {
    public static int multirec(int n1, int n2) {
        // Caso base
        if (n1 == 0 || n2 == 0)
            return 0;
        return n1 + multirec(n1, n2-1);
    }

    public static void main(String[] args) {
        System.out.println(multirec(2, 3));
    }
}
