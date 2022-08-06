import org.junit.Test;

import static org.junit.Assert.*;

public class PlatoTest {

    @Test
    public void getNombre() {
        Plato plato = new Plato(12,"Hamburguesa");
        assertNotNull(plato.getNombre());

    }
}