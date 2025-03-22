import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("========= Copa Pistão 2025 =========");

        var carro1 = new Carro("GM", "Opala 1", 180, true);
        var carro2 = new Carro("GM", "Opala 2", 190, false);
        var carro3 = new Carro("GM", "Opala 3", 170, true);
        var carro4 = new Carro("GM", "Opala 4", 185, false);

        List<Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4);
        exibirCompetidores(carros);

        iniciarCircuitoDaCorrida(carros, true);
    }

    private static void iniciarCircuitoDaCorrida(List<Carro> carros, Boolean ehChuva) {
        var carroDaFrente = carros.getFirst();
        for (Carro carro : carros) {
            if (carro.equals(carroDaFrente)) continue; // ir para a próxima iteração

            if (ehChuva) {
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