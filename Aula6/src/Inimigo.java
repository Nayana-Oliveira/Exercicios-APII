import java.util.Random;

public class Inimigo implements Combatente {
    private Random rnd = new Random();
    private String nome;
    private int hp;
    private int AC;

    public Inimigo(String nome, int hp, int AC) {
        this.nome = nome;
        this.hp = hp;
        this.AC = AC;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int rolarParaAcertar() {
        return rnd.nextInt(1, 21);
    }

    @Override
    public int rolarDano() {
        return rnd.nextInt(1, 5);
    }

    @Override
    public void receberDano(int dano) {
        setHp(getHp() - dano);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getAC() {
        return AC;
    }

    @Override
    public boolean getVivo() {
        if (hp > 0) {
            return true;
        } else {
            return false;
        }
    }
}
