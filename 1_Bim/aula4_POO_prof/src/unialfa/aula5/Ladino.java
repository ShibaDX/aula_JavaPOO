package unialfa.aula5;

public class Ladino extends Personagem{
    @Override
    public Integer atacar() {
        return getAgilidade();
    }
}
