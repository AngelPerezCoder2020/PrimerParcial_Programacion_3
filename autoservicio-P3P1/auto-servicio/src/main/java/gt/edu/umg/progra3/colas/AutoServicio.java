package gt.edu.umg.progra3.colas;

import java.util.NoSuchElementException;

public class AutoServicio {

    private Cola cola;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }
    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    public String ingresarAuto(String placa){
        cola.enqueue(placa);
        return null;
    }

    public String proximoAuto(){
        return cola.peek();
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
        return cola.deque();
    }

    public int obtenerAutosEnCola(){
        return cola.size();
    }
}