public class Vilao extends Protagonista {
    public Vilao(String papel, String nome) {
        super(papel, nome);
    }

    @Override
    public void usaHabilidade(String habilidade) {
        System.out.println("O vilão usa habilidade: "+ habilidade);
    }
}
