public class BatalhaEngine {

    public boolean ataque(Combatente a, Combatente b) {
        if (a.rolarParaAcertar() >= b.getAC()) {
            b.receberDano(a.rolarDano());
            return true;
        } else {
            return false;
        }
    }

    public void lutar(Combatente a, Combatente b) {
        if (ataque(a, b) || a.getVivo()) {
            System.out.println(a.getNome() + " acertou " + b.getNome());
            if (b.getVivo()) {
                System.out.println(b.getNome() + " continua vivo!");
            } else {
                System.out.println(b.getNome() + " morreu!");
            }
        } else {
            System.out.println(a.getNome() + " errou " + b.getNome());
        }
    }
}
