public class Pessoa {

    public static final String MAIS_VELHO = " é mais velho que ";
    // atributos
    private String nome;
    private String cpf;
    private int anoNascimento;

    // construtores
    public Pessoa(String nome, String cpf, int anoNascimento) {
        // this = refere-se à própria classe
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    // métodos
    public String compararAno(Pessoa outraPessoa) {
        if (this.anoNascimento < outraPessoa.anoNascimento) {
            return this.nome + MAIS_VELHO + outraPessoa.nome;
        } else {
            return outraPessoa.nome + MAIS_VELHO + this.nome;
        }
    }

    public String responder(String pergunta) {
        pensar(pergunta);
        return "Resposta";
    }

    private void pensar() {
        System.out.println("Pensando");
    }

    private void pensar(String pergunta) {
        System.out.println("Pensando em " + pergunta);
    }
}
