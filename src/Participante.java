public class Participante extends Elemento {

    private String dni;
    private String nombre;

    public Participante(String descripcion, String dni, String nombre) {
        super(descripcion);
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String mostrarInfo() {
        return "PARTICIPANTE " +
               "Nombre: " + nombre +
               " DNI        : " + dni +
               " Descripción: " + getDescripcion();
    }
}
