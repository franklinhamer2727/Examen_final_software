import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetPedidoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPedido() {
        assertEquals("12.00",new  Menu().getPrecio());
        assertEquals("25.00", new Carta().getPrecio());
    }
}