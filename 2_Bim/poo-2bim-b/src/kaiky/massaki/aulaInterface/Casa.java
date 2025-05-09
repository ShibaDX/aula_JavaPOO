package kaiky.massaki.aulaInterface;

public class Casa {
    public Boolean colocarTomada(Tomada tomada){
        return tomada.conectar();
    }
}
