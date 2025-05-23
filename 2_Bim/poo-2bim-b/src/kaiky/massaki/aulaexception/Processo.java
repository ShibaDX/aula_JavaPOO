package kaiky.massaki.aulaexception;

import java.util.Scanner;

public class Processo {
    private Scanner scanner;

    public Processo(Scanner scanner) {
        this.scanner = scanner;
    }

    public int lerNumero() throws RuntimeException {
        int numero = scanner.nextInt();

        if (numero > 9999) {
            throw new RuntimeException(" Numero tem quer no maximo 4 digitos!");
        }

        return numero;
    }
}
