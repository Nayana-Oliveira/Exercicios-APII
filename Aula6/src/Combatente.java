public interface Combatente {
    public abstract int rolarParaAcertar();
    public abstract int rolarDano();
    public abstract void receberDano(int dano);
    public abstract String getNome();
    public abstract int getAC();
    public abstract boolean getVivo();
}
