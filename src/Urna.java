import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Urna<T> {

    private List<T> elementos;
    private Random random;

    public Urna() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    public void agregarElemento(T elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo a la urna.");
        }
        elementos.add(elemento);
    }

    public T extraerElemento() {
        if (estaVacia()) {
            throw new IllegalStateException("La urna está vacía. No hay elementos para sortear.");
        }
        int indiceAleatorio = random.nextInt(elementos.size());
        return elementos.remove(indiceAleatorio);
    }

    public int consultarCantidad() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
