public class Aluno {
    //Quais atributos pelo menos 3 e dois metodos.

    //Atributos
    private String nome;
    private String cpf;
    private String turma;
    private int qi;
    private int falta;

    //Contrutores
    /*
    public Aluno(String nome,
                 String cpf,
                 String turma,
                 int qi,
                 int falta){
        this.nome = nome;
        this.cpf = cpf;
        this.turma = turma;
        this.qi = qi;
        this.falta = falta;
    }
    */

    //Encapsulamento
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setQi(int qi) {
        this.qi = qi;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTurma() {
        return turma;
    }

    public int getQi() {
        return qi;
    }

    public int getFalta() {
        return falta;
    }

    //Ações / Metódos
    public String comparQi(Aluno qiOutra){
        if (this.qi > qiOutra.qi){
            return this.nome + " é mais esperto que " + qiOutra.nome;
        } else {
            return qiOutra.nome + " é mais esperto que " + this.nome;
        }
    }

    public String faltaMaxima(){
        if (this.falta > 24) {
            return this.nome + " Atingio o limite maximo de faltas" ;
        } else if (this.falta >= 18) {
            return this.nome + " Pode faltar ainda " + (24 - this.falta);
        } else if (this.falta >= 8) {
            return this.nome + " Ta suave demais";
        } else {
            return this.nome + "Orgulho da profissão";
        }
    }
}
