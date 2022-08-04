import java.util.Objects;

public class principalTest {

    @org.junit.Test
    public void main() {
        GetPedido ido = new GetPedido();

        String  compra ="Carta";
        String i = "25";
        String valor = ido.getPedido(compra).getPrecio();
        assertArrayEquals(i,valor);
        String  compra2 = "Menu";
        String j = "12";
        String valor2 = ido.getPedido(compra2).getPrecio();
        assertArrayEquals(j,valor2);

        SuperTarea st = new SuperTarea();

    }
    private boolean assertArrayEquals(String i, String valor) {
        return Objects.equals(i, valor);
    }


}