package kaiky.massaki.aulaInterface;

public class Geladeira implements Tomada{
    @Override
    public Boolean conectar() {
        System.out.println("A geladeira foi conectada!");
        return true;
    }
}
