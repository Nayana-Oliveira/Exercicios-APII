public class BuscaBinaria {

    public static int buscaBinariaIterativa(int [] a, int x) {
        int inicio = 0;
        int fim = a.length - 1;

        while(inicio <= fim) {
            int meio = (inicio + fim)/2;

            if(x ==a[meio]) {
                return meio;
            } else if (x > a[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(buscaBinariaIterativa(a, 22));
    }
}
