import java.util.LinkedList;

public class ColaEnlazada<T> implements Cola<T> {
    private LinkedList<T> lista;

    public ColaEnlazada() {
        lista = new LinkedList<>();
    }

    @Override
    public void encolar(T elemento) {
        lista.addLast(elemento);
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return lista.removeFirst();
    }

    @Override
    public T frente() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return lista.getFirst();
    }

    @Override
    public boolean estaVacia() {
        return lista.isEmpty();
    }

    @Override
    public int tamaño() {
        return lista.size();
    }
}
