public class PrimeraMayuscula {

    public static String primeraMayuscula(String frase) {
        String fraseConvertida = "";

        for (int i = 0; i < frase.length(); i++) {

            boolean validarLetra;
            boolean validarAnterior;

            if (i == 0)
                validarAnterior = false;

            else
                validarAnterior = validarLetra(frase.charAt(i - 1));

            validarLetra = validarLetra(frase.charAt(i));

            if (validarLetra && !validarAnterior) {
                fraseConvertida += Character.toString(frase.charAt(i)).toUpperCase();
            }
            else
                fraseConvertida += Character.toString(frase.charAt(i)).toLowerCase();

        }

        return fraseConvertida;
    }

    private static boolean validarLetra(char x) {
        boolean esLetra;
        if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
            esLetra = true;
        } else
            esLetra = false;

        return esLetra;
    }

}
