public class ExercicioFib {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fib("+n+") = "+ fib(n));
    }
}