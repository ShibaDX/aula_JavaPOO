package unialfa.aula4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("========= Copa Pistão 2025 =========");

        var carro1 = new Carro(Marca.VW, "Gol GTI 94", 180, true);
        var carro2 = new Carro(Marca.GM, "Opala", 190, false);
        var carro3 = new Carro(Marca.TOYOTA, "Hylux", 170, true);
        var carro4 = new Carro(Marca.FIAT, "Uno", 185, false);

        var pistaInterlagos = new Pista(true, "Interlagos", 5000, true);
        var pistaArturTomas = new Pista(false, "Pç Artur Tomas", 500, false);

        List<Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4);
        exibirCompetidores(carros);
        System.out.println();
        passarPeloBarro(carros);
        System.out.println();

        iniciarCircuitoDaCorrida(carros, pistaInterlagos);
    }

    private static void passarPeloBarro(List<Carro> carros) {
        System.out.println("Passando pelo barro");
        for (Carro c : carros) {
            switch (c.getMarca()) {
                case TOYOTA, FIAT -> System.out.println(c.getModelo() + " passa tranquilo");
                case VW -> System.out.println(c.getModelo() + " passa penando");
                default -> System.out.println(c.getModelo() + " nunca passa");
            }
        }
    }

    private static void iniciarCircuitoDaCorrida(List<Carro> carros, Pista pista) {
        var carroDaFrente = carros.getFirst();
        for (Carro carro : carros) {
            if (carro.equals(carroDaFrente)) continue; // ir para a próxima iteração

            if (pista.ehChuva()) {
                if (carro.ehMaisRapidoComChuva(carroDaFrente)) carroDaFrente = carro;
            } else {
                if (carro.ehMaisRapido(carroDaFrente)) carroDaFrente = carro;
            }
        }
        System.out.println("O campeão é " + carroDaFrente.getModelo());
    }

    private static void exibirCompetidores(List<Carro> carros) {
        System.out.println("Competidores:");
        for (Carro carro : carros) {
            System.out.println(carro.getModelo());
        }
    }
}