package gt.edu.umg.progra3.colas;

public interface Cola {
    /**
     * emcola el item que se desea agregar
     * @param item
     * @return
     */
    void enqueue(String item);

    /**
     * desencola el item en turno
     * @return
     */
    String deque();
    /**
     * retorna el valor del elemento en la cima
     * @return
     */
    String peek();

    /**
     * retorna el tamaño de la pila
     * @return
     */
    int size();

    /**
     * indica si la pila se encuentra vacia
     * @return
     */
    boolean isEmpty();
}