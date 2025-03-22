public class Main {
    public static void main(String[] args) {

    }

    private static Aluno cadastrarAluno(String nome, String cpf, String turma, int qi, int falta ){
        var aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setTurma(turma);
        aluno.setQi(qi);
        aluno.setFalta(falta);
        return aluno;
    }
}