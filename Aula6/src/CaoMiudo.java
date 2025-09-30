public class CaoMiudo {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Arnold, o bravo", 16, 12,8);
        Inimigo i = new Inimigo("Goblin caolho", 5, 10);
        BatalhaEngine bc = new BatalhaEngine();

        bc.lutar(g, i);
    }
}
