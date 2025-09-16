public class Main {
    public static void main(String[] args) {
        Heroi h = new Heroi("Salvar o mundo", "Batman");
        Vilao v = new Vilao("Acabar com o mundo", "Coringa");
        Npc npc = new Npc("Morrer");

        System.out.println(h.getNome());
        System.out.println(h.getPapel());
        h.usaHabilidade("Ser rico");


        System.out.println(v.getNome());
        System.out.println(v.getPapel());
        v.usaHabilidade("Ser pobre");

        System.out.println(npc.getPapel());
    }
}
