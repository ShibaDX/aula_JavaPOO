package kaiky.massaki.aulaInterface;

public interface Usb {
    default Boolean conectar(){
        System.out.println("Conectado!");
        return true;
    }
}
