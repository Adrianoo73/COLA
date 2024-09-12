public class Main {
    public static void main(String[] args) {
        Cola<Integer> cola = new ColaEnlazada<>();

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Frente de la cola: " + cola.frente()); // 1
        System.out.println("Tamaño de la cola: " + cola.tamaño()); // 3

        System.out.println("Desencolando: " + cola.desencolar()); // 1
        System.out.println("Frente de la cola: " + cola.frente()); // 2
    }
}

