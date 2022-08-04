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

        //st.addTarea(new TareaRegistrarPlato());
        st.addTarea(new TareaListarPlato());
        String pedido = "Hamburguesa";
        GestorTareas gt= new GestorTareas();
        Plato plato= new Plato(1,pedido);
        String hamburguesa = "Hamburguesa";
        assertArrayEquals(gt.ejecutar(st,plato),hamburguesa);

        //test de bridge
        MetodoPago pa1 = new Tarjeta(new Consumo());
        MetodoPago pa2 = new Efectivo(new Consumo());
        assertArrayEquals(pa1.pagar(),"Su cuenta fue Dolares");
        assertArrayEquals(pa2.pagar(),"Su cuenta fue Dolares");


    }
    private boolean assertArrayEquals(String i, String valor) {
        return Objects.equals(i, valor);
    }


}