import java.util.ArrayList;
import java.util.Scanner;

public class Metodos1 {

    public static double validarDouble (Scanner scan){
        boolean validar = false;
        double valor=0f;
        while (!validar) {

            if (scan.hasNextDouble()) {
                validar = true;
                valor = scan.nextDouble();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }
    public static int validarInt (Scanner scan){
        boolean validar = false;
        int valor=0;
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

    public static boolean validar (Scanner scan){
        boolean validar = false;
        String respuesta;
        boolean opcion = false;
        while (!validar) {
            respuesta = scan.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                validar=true;
                
                opcion =  true;
            }
            else if(respuesta.equalsIgnoreCase("no")){
                validar=true;
                
            }
            else{
                System.out.println("Respuesta incorrecta: ");
            }
        }
        return opcion;

    }

    public static int validarTipoIVA (Scanner scan){
        boolean validar = false;
        int valor=validarInt(scan);
        while (!validar) {

            if (valor==0||valor==4||valor==10||valor==21) {
                
                validar = true;

            } else {
                System.out.print("Introduce un tipo de IVA correcto:");
                valor = scan.nextInt();
                scan.nextLine();
            }

        }
        return valor;
    }
}
