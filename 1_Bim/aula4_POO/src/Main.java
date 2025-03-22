public class Main {
    public static void main(String[] args) {
        double comprimentoPista = 150;

        var carro1 = cadastrarCarro("A", "A", 0, 25, 0, false);
        var carro2 = cadastrarCarro("B", "A", 0, 11, 0, false);
        var carro3 = cadastrarCarro("C", "A", 0, 30, 0, false);
        var carro4 = cadastrarCarro("D", "A", 0, 20, 0, false);

    do {
        acelerarCarros(carro1, carro2, carro3, carro4);
        System.out.println("Velocidade: " + carro1.getVelocidade());
        correrCarros(carro1, carro2, carro3, carro4);
        System.out.println("Distância percorrida: " + carro1.getDistPercorrido());

        verificarVitoria(carro1, carro2, carro3, carro4, comprimentoPista);

    } while(carro1.isGanhou() || carro2.isGanhou() || carro3.isGanhou() || carro4.isGanhou());

        if (carro1.isGanhou()) {
            System.out.println("O carro " + carro1.getModelo() + " ganhou!");
        } else if (carro2.isGanhou()) {
            System.out.println("O carro " + carro2.getModelo() + " ganhou!");
        } else if (carro3.isGanhou()) {
            System.out.println("O carro " + carro3.getModelo() + " ganhou!");
        } else if (carro4.isGanhou()) {
            System.out.println("O carro " + carro4.getModelo() + " ganhou!");
        }
    }

    private static Carro cadastrarCarro(String modelo, String marca, double velocidade, double aceleracao, double distPercorrido, boolean ganhou){
        var carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setVelocidade(velocidade);
        carro.setAceleracao(aceleracao);
        carro.setDistPercorrido(distPercorrido);
        carro.setGanhou(ganhou);
        return carro;
    }

    private static void acelerarCarros(Carro carro1, Carro carro2, Carro carro3, Carro carro4) {
        carro1.acelerar();
        carro2.acelerar();
        carro3.acelerar();
        carro4.acelerar();
    }
    private static void correrCarros(Carro carro1, Carro carro2, Carro carro3, Carro carro4) {
        carro1.correr();
        carro2.correr();
        carro3.correr();
        carro4.correr();
    }
    private static void verificarVitoria(Carro carro1, Carro carro2, Carro carro3, Carro carro4, double comprimento) {
        carro1.verificar(comprimento);
        carro2.verificar(comprimento);
        carro3.verificar(comprimento);
        carro4.verificar(comprimento);
    }
}