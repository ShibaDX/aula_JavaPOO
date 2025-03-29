package unialfa.aula5;

public abstract class Personagem {

    private String nome;
    private Integer forca;
    private Integer agilidade;
    private Integer saude;

    public Personagem() {
    }

    public Personagem(String nome, Integer agilidade, Integer forca, Integer saude) {
        this.nome = nome;
        this.agilidade = agilidade;
        this.forca = forca;
        this.saude = saude;
    }

    public abstract Integer atacar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }

    public Integer getSaude() {
        return saude;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }
}
