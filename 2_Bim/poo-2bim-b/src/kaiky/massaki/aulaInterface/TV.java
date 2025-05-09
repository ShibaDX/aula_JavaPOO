package kaiky.massaki.aulaInterface;

public class TV implements Tomada{
    @Override
    public Boolean conectar() {
        System.out.println("A TV foi conectada!");
        return true;
    }
}
