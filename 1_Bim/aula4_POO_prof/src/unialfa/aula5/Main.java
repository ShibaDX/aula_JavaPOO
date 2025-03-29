package unialfa.aula5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Corinthians campeão Paulista 2025!!!");

        Personagem guerreiro = new Guerreiro();
        guerreiro.setNome("Guerreiro");
        guerreiro.setForca(10);

        Personagem ladino = new Ladino();
        ladino.setNome("Ladino");
        ladino.setAgilidade(10);

        Boss boss = new Boss("Ender Dragon", 10, 10, 10);

        duelar(ladino, boss);

        System.out.println(guerreiro.atacar());
    }

    private static void duelar(Personagem player, Boss boss) {
        System.out.println("Duelo entre " + player.getNome() + " e " + boss.nome());
    }
}
