package unialfa.aula4;

public class Carro {
    private Marca marca;
    private String modelo;
    private Integer velocidade;
    private Boolean bomNaChuva;

    public Carro() {
    }

    public Carro(Marca marca, String modelo, Integer velocidade, Boolean bomNaChuva) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.bomNaChuva = bomNaChuva;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Boolean getBomNaChuva() {
        return bomNaChuva;
    }

    public void setBomNaChuva(Boolean bomNaChuva) {
        this.bomNaChuva = bomNaChuva;
    }

    public Boolean ehMaisRapido(Carro outroCarro) {
        return this.velocidade > outroCarro.velocidade;
    }

    public Boolean ehMaisRapidoComChuva(Carro outroCarro) {
        return penalidadeChuva(this) > penalidadeChuva(outroCarro);
    }

    private Integer penalidadeChuva(Carro carro) {
        return carro.bomNaChuva ? carro.velocidade : carro.velocidade - 20;
    }
}
