public interface Cola<T> {

    void encolar(T elemento);// Agrega un elemento al final de la cola

    T desencolar();// Elimina y retorna el elemento del frente de la cola

    T frente();// Retorna el elemento del frente de la cola sin eliminarlo

    boolean estaVacia();// Verifica si la cola está vacía

    int tamaño();// Retorna el tamaño de la cola
}
