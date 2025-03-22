public class Carro {
    // atributos
    private String modelo;
    private String marca;
    private double velocidade;
    private double aceleracao;
    private double distPercorrido;
    private boolean ganhou;

    // construtor

   /* public Carro(String modelo, String marca, double velocidade, double velocidadeMax, double aceleracao) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
        this.aceleracao = aceleracao;
    } */


    // métodos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getDistPercorrido() {
        return distPercorrido;
    }

    public void setDistPercorrido(double distPercorrido) {
        this.distPercorrido = distPercorrido;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public void acelerar() {
        this.velocidade = this.velocidade + this.aceleracao;
    }

    public void correr() {
        this.distPercorrido = this.distPercorrido + this.velocidade;
    }
    public void verificar(double comprimentoPista) {
        if (this.distPercorrido >= comprimentoPista) {
            this.ganhou = true;
        }
    }
}