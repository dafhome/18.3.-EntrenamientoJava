import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos a calcula el IVA del artículo que me indiques.");
        System.out.println();
        System.out.print("Articulo: ");
        String articulo = scan.nextLine();
        System.out.print("Precio: ");
        double precio = Metodos.validarDouble(scan);
        System.out.print("Tipo de IVA. Indica 0, 4, 10 o 21: ");
        int tipoIVA = Metodos.validarTipoIVA(scan);
        double IVA =(double) Math.round(CalculoIVA.calculoIVA(precio, tipoIVA)*100.0)/100.0;
        double precioIVA =(double) Math.round(CalculoIVA.sumarIVA(precio, tipoIVA)*100.0)/100.0;

        System.out.println();
        System.out.println(articulo+" tiene un IVA del "+tipoIVA+"% El IVA será de "+IVA+"€ haciendo un precio con IVA de "+precioIVA+"€");


    }
}
