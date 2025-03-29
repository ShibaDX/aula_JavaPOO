package unialfa.aula5;

public class Guerreiro extends Personagem{
    @Override
    public Integer atacar() {
        return getForca();
    }
}
