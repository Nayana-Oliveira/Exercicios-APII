//Crie um programa que contenha uma função recursiva para encontrar o menor elemento em um vetor.

public class Exercicio7 {

    public static int menorElemRec(int[] vetor, int n) {
        if (n == 1){
            return vetor[0];
        }

        int menorElem = menorElemRec(vetor,n-1);

        if (menorElem < vetor[n-1]) {
            return menorElem;
        } else {
            return vetor[n-1];
        }
    }
    public static void main(String[] args) {
        int[] vet1 = {6};
        int[] vet2 = {6, 1};
        int[] vet3 = {6, 7, 1};
        int[] vet4 = {6, 7, 1, 9};
        int[] vet5 = {6, 7, 1, 9, 3};

        System.out.println(menorElemRec(vet1, vet1.length));
        System.out.println(menorElemRec(vet2, vet2.length));
        System.out.println(menorElemRec(vet3, vet3.length));
        System.out.println(menorElemRec(vet4, vet4.length));
        System.out.println(menorElemRec(vet5, vet5.length));
    }
}
