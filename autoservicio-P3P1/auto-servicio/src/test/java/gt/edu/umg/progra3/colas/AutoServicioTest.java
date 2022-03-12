package gt.edu.umg.progra3.colas;

import org.junit.Before;
import org.junit.Test;

public class AutoServicioTest {
    Cola cola = new ColaImplementacion();
    AutoServicio autoServicio;

    @Before
    public void init(){
        //reemplazar por la implementacion de la cola desarrollada
        //cola = new ColaImpl();
        autoServicio = new AutoServicio(cola);
        autoServicio.ingresarAuto("ABC123");
        autoServicio.ingresarAuto("CDE456");
        autoServicio.ingresarAuto("FGH789");
    }

    @Test
    public void testIngresarAuto(){
        autoServicio.ingresarAuto("JKL147");
        assert(autoServicio.proximoAuto().equals("ABC123"));
        assert(autoServicio.obtenerAutosEnCola()==4);
    }

    @Test
    public void testEntregarAuto(){
        String entrega = autoServicio.entregarAuto();
        assert(entrega.equals("ABC123"));
        assert(autoServicio.proximoAuto().equals("CDE456"));
    }

}
