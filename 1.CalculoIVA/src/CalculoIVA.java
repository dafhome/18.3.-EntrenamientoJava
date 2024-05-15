import java.util.Scanner;

public class CalculoIVA {

    static final double GENERAL = 0.21f;
    static final double REDUCIDO = 0.10f;
    static final double SUPER = 0.04f;
    final static double EXENTO = 0.00f;

    public static double calculoIVA(double precio, int tipoIVA) {

        double IVA = 0f;

        switch (tipoIVA) {
            case 21:
                IVA = precio * GENERAL;
                break;

            case 10:
                IVA = precio * REDUCIDO;
                break;
            case 4:
                IVA = precio * SUPER;
                break;
            case 0:
                IVA = precio * EXENTO;
                break;

            default:
                System.out.println("El tipo de IVA es incorrecto, no puedo calcularlo.");
                break;
        }

        return IVA;
    }

    public static double sumarIVA(double precio, int tipoIVA) {
        double precioIVA = 0f;
        switch (tipoIVA) {
            case 21:
                precioIVA = precio * (1 + GENERAL);
                break;

            case 10:
                precioIVA = precio * (1 + REDUCIDO);
                break;
            case 4:
                precioIVA = precio * (1 + SUPER);
                break;
            case 0:
                precioIVA = precio * (1 + EXENTO);
                break;

            default:
                System.out.println("El tipo de IVA es incorrecto, no puedo calcularlo.");
                break;
        }

        return precioIVA;

    }

}

