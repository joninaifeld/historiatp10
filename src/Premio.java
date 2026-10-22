public class Premio extends Elemento {

    private int idPremio;
    private double valor;

    public Premio(String descripcion, int idPremio, double valor) {
        super(descripcion);
        this.idPremio = idPremio;
        this.valor = valor;
    }


    public int getIdPremio() {
        return idPremio;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String mostrarInfo() {
        return "PREMIO " +
               "Descripción: " + getDescripcion() +
               " ID         : " + idPremio +
               " Valor      : $" + String.format("%.2f", valor);
    }
}
