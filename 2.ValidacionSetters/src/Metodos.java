import java.util.Scanner;

public class Metodos {
    public static int validarInt(Scanner scan) {
        boolean validar = false;
        int valor = 0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                valor = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }
}
