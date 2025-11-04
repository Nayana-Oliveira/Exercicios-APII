import java.util.Arrays;

public class BubbleSort {

    public static void bubbleShortOtimizado(int[] a) {
        int n = a.length;
        boolean trocou;

        int comps = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comps++;
                if (a[j] > a[j + 1]) {
                    trocas++;
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    trocou = true;
                }
            }
            if (trocou == false) {
                break;
            }
        }
        System.out.println("Número de comparações: " + comps);
        System.out.println("Número de trocas: " + trocas);
    }

    public static void bubbleShortIterativo(int[] a) {
        int n = a.length;

        int comps = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comps++;
                if (a[j] > a[j + 1]) {
                    trocas++;
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        System.out.println("Número de comparações: " + comps);
        System.out.println("Número de trocas: " + trocas);
    }

    public static void bubbleSortRecursivo(int[] a, int n) {
        if(n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
               int aux = a[i];
               a[i] = a[i + 1];
               a[i + 1] = aux;
            }
        }
        bubbleSortRecursivo(a, n-1);
    }

    public static void main(String[] args) {
//        int[] a = {7, 3, 1, 4, 2, 5};
//        System.out.println(Arrays.toString(a));
//        bubbleShortIterativo(a);
//        System.out.println(Arrays.toString(a));
//
//        int[] b = {7, 3, 1, 4, 2, 5};
//        System.out.println(Arrays.toString(b));
//        bubbleShortOtimizado(b);
//        System.out.println(Arrays.toString(b));

        int[] c = {7, 3, 1, 4, 2, 5};
        System.out.println(Arrays.toString(c));
        bubbleSortRecursivo(c, c.length);
        System.out.println(Arrays.toString(c));
    }
}
