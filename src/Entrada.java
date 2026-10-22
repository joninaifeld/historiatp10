public class Entrada extends Elemento {

    private String codigo;
    private int numAsiento;

    public Entrada(String descripcion, String codigo, int numAsiento) {
        super(descripcion);
        this.codigo = codigo;
        this.numAsiento = numAsiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    @Override
    public String mostrarInfo() {
        return "ENTRADA " +
               "Evento: " + getDescripcion() +
               " Código    : " + codigo +
               " Asiento N°: " + numAsiento;
    }
}
