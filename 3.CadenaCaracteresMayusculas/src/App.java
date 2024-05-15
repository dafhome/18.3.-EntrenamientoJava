import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Introduce una frase como quieras y te la devolveré toda en minúsculas y la primera Letra de cada palabra en minúsculas:");
        String frase = scan.nextLine();

        System.out.println();
        System.out.println("Tu frase corregida es:");
        System.out.println(PrimeraMayuscula.primeraMayuscula(frase));

        scan.close();
    }
}
