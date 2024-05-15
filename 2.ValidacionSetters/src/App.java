import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        ArrayList<Discoteca> entrada = new ArrayList<>();

        entrada.add(new Discoteca("Pedro", 18, true));
        entrada.add(new Discoteca("Laura", 23, true));
        entrada.add(new Discoteca("Juana", 28, true));

        System.out.println();
        System.out.println("BiEnVeNiDoS a BlInG bLiNg");
        System.out.println();
        for (Discoteca persona : entrada) {
            System.out.println(persona);
        }
        boolean validar = false;

        while (!validar) {
            System.out.println();
            System.out.println("Pulsa ENTER para entrar y cualquier otra tecla para salir.");
            String opcion = scan.nextLine();
            if (opcion.equals("")) {
                entrada.add(new Discoteca());
                int ultimoIndex = entrada.size() - 1;
                System.out.print("Nombre: ");
                entrada.get(ultimoIndex).setNombre(scan.nextLine());
                System.out.print("Edad: ");
                entrada.get(ultimoIndex).setEdad(Metodos.validarInt(scan));
                System.out.println(entrada.get(ultimoIndex));
                if (!entrada.get(ultimoIndex).isPuedeEntrar()) {
                    System.out.println("Lo siento mucho, te tienes que ir.");
                    entrada.remove(ultimoIndex);
                } else
                    System.out.println("Gracias por venir");
            } else{
                System.out.println("Hasta otro día");
                validar=true;
            }
                

            System.out.println();
            System.out.println("Actualmente dentro están:");
            for (Discoteca persona : entrada) {
                System.out.println(persona);
            }
        }

    }
}
