public class Discoteca {
    private String nombre;
    private int edad;
    private boolean puedeEntrar;
    public Discoteca(String nombre, int edad, boolean puedeEntrar) {
        this.nombre = nombre;
        this.edad = edad;
        this.puedeEntrar = puedeEntrar;
    }
    public Discoteca() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;

        boolean entrada = (edad>=18);
        setPuedeEntrar(entrada);
    }
    public boolean isPuedeEntrar() {
        return puedeEntrar;
    }
    public void setPuedeEntrar(boolean puedeEntrar) {
        this.puedeEntrar = puedeEntrar;
    }
    @Override
    public String toString() {
        String entra;
        if(puedeEntrar)
            entra = "puede pasar";
        else
            entra = "no puede pasar";
        return nombre + " tiene " + edad + " años y " + entra + ".";
    }

    
}
