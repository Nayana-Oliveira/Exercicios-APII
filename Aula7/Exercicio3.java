import java.util.*;

class Aluno {
    int numero;
    String nome;

    Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String toString() {
        return numero + " - " + nome;
    }
}

class Nota {
    int numeroAluno;
    double valor;

    Nota(int numeroAluno, double valor) {
        this.numeroAluno = numeroAluno;
        this.valor = valor;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Stack<Aluno> alunos = new Stack<>();
        Queue<Nota> notas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;
        int proximoNumeroAluno = 1;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 – Cadastrar aluno");
            System.out.println("2 – Cadastrar nota");
            System.out.println("3 – Calcular média de um aluno");
            System.out.println("4 – Listar alunos sem notas");
            System.out.println("5 – Excluir aluno");
            System.out.println("6 – Excluir nota");
            System.out.println("7 – Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    alunos.push(new Aluno(proximoNumeroAluno++, nome));
                    System.out.println("Aluno cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.print("Número do aluno: ");
                    int numAluno = sc.nextInt();
                    boolean existe = alunos.stream().anyMatch(a -> a.numero == numAluno);
                    if (!existe) {
                        System.out.println("Aluno não cadastrado.");
                        break;
                    }
                    System.out.print("Nota (0 a 10): ");
                    double notaValor = sc.nextDouble();
                    if (notaValor < 0 || notaValor > 10) {
                        System.out.println("Nota inválida.");
                    } else {
                        notas.add(new Nota(numAluno, notaValor));
                        System.out.println("Nota cadastrada.");
                    }
                    break;

                case 3:
                    System.out.print("Número do aluno: ");
                    int num = sc.nextInt();
                    double soma = 0;
                    int cont = 0;
                    for (Nota n : notas) {
                        if (n.numeroAluno == num) {
                            soma += n.valor;
                            cont++;
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Sem notas para este aluno.");
                    } else {
                        String nomeAluno = alunos.stream().filter(a -> a.numero == num)
                                .map(a -> a.nome).findFirst().orElse("Desconhecido");
                        System.out.println("Aluno: " + nomeAluno);
                        System.out.println("Média: " + (soma / cont));
                    }
                    break;

                case 4:
                    System.out.println("Alunos sem notas:");
                    for (Aluno a : alunos) {
                        boolean temNota = notas.stream().anyMatch(n -> n.numeroAluno == a.numero);
                        if (!temNota) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 5:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno para excluir.");
                    } else {
                        Aluno ultimo = alunos.peek();
                        boolean temNota = notas.stream().anyMatch(n -> n.numeroAluno == ultimo.numero);
                        if (temNota) {
                            System.out.println("Não é possível excluir: aluno tem notas.");
                        } else {
                            System.out.println("Aluno removido: " + alunos.pop());
                        }
                    }
                    break;

                case 6:
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota para excluir.");
                    } else {
                        Nota removida = notas.poll();
                        System.out.println("Nota removida do aluno " + removida.numeroAluno);
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }
}
