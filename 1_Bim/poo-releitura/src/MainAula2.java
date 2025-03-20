public class MainAula2 {

    private static final int NOME = 0;
    private static final int CPF = 1;
    private static final int ANO = 2;

    public static void main(String[] args) {
        // declaração de objeto - letra maiúscula: classe, letra minúscula: objeto
        var pessoa1 = new Pessoa("Pessoa 1", "1234567890", 2005);
        var pessoa2 = new Pessoa("Pessoa 2", "0987654321", 2000);

        System.out.println(pessoa1.compararAno(pessoa2));
        System.out.println(pessoa2.compararAno(pessoa1));

    }

}



