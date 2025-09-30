public abstract class Personagem implements Combatente {
    private String nome;
    private int forca;
    private int destreza;
    private int inteligencia;
    private int nivel;
    private int ouro;
    private int maxHP;
    private int hp;
    private int maxMP;
    private int mp;
    private int AC;

    public Personagem(String nome, int forca, int destreza, int inteligencia) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.nivel = 1;
        this.ouro = 100;
        calcularAtributosDerivados();
    }

    private void calcularAtributosDerivados() {
        this.maxHP = 10 + getModificadorAtributo(forca);
        this.hp = maxHP;
        this.maxMP = 10 + getModificadorAtributo(inteligencia);
        this.mp = maxMP;
        this.AC = 10 + getModificadorAtributo(destreza);
    }

    public int getModificadorAtributo(int atributo) {
        return (atributo - 10)/2;
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
}
