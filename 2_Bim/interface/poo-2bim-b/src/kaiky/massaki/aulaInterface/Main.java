package kaiky.massaki.aulaInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aula Interfaces");

        var computador = new Computador();
        var teclado = new Teclado();
        var mouse = new Mouse();

        computador.plugar(teclado);
        computador.plugar(mouse);

          /*  var casa = new Casa();
            var geladeira = new Geladeira();
            var tv = new TV();
            casa.colocarTomada(geladeira);
            casa.colocarTomada(tv); */

    }
}