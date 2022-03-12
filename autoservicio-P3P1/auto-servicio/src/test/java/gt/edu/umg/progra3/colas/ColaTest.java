package gt.edu.umg.progra3.colas;

import org.junit.Before;
import org.junit.Test;

public class ColaTest {

    private Cola cola;

    @Before
    public void init(){
        cola = new ColaImplementacion();
        cola.enqueue("Bienvenidos");
        cola.enqueue("a");
        cola.enqueue("Programacion 3");
    }

    @Test
    public void testPushCola(){
        cola.enqueue("testPushPila");
        String cima = cola.peek();
        assert(cima.equals("Bienvenidos"));
    }

    @Test
    public void testPopCola(){
        String cima1 = cola.deque();
        String cima2 = cola.peek();
        assert(cima1.equals("Bienvenidos"));
        assert(cima2.equals("a"));

    }

    @Test
    public void testSizeCola(){
        int t1 = cola.size();
        cola.deque();
        cola.deque();
        int t2 = cola.size();
        assert (t1==3);
        assert (t2==1);

    }
}