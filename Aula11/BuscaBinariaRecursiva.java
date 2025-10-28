public class BuscaBinariaRecursiva {

    public static int buscaBinaria(int[] a, int x, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (x == a[meio]) {
            return meio;
        }
        else if (x > a[meio]) {
            return buscaBinaria(a, x, meio + 1, fim);
        }
        else {
            return buscaBinaria(a, x, inicio, meio - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(buscaBinaria(a, 23, 0, a.length - 1));
    }

}
