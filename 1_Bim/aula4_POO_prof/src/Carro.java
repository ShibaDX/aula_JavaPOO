public class Carro {
    private String marca;
    private String modelo;
    private Integer velocidade;
    private Boolean bomNaChuva;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer velocidade, Boolean bomNaChuva) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.bomNaChuva = bomNaChuva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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
        penalidadeChuva(this);
        penalidadeChuva(outroCarro);
        return ehMaisRapido(outroCarro);
    }

    private void penalidadeChuva(Carro carro) {
        if (!carro.bomNaChuva) carro.velocidade = carro.velocidade - 20;
    }
}
