public class exercicio2 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {4, 5},
        };

        int[][] B = {
                {9, 8},
                {6, 5},
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Matriz A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}