//Fatorial de um número

//int fat(int n){
//    if(n==0)
//        return 1;
//    else
//        return n*fat(n-1);
//}

public class Aulafatorial {

    public static int fatorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static int soma(int n) {
        if (n == 0){
            return 0; // caso base
        } else {
            return n + soma(n - 1);
        }
    }

    public static void main(String[] args){
        for (int n = 0; n < 10; n++) {
            System.out.println("fatorial("+n+") = " + fatorial(n));
            System.out.println("soma("+n+") = " + soma(n));
        }
    }
}