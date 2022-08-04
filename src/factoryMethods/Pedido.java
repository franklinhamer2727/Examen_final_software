import java.io.*;

abstract class Pedido{
    protected double precio;
    abstract void getPrecio();
    public String Calculator(int unidades) {
        return unidades*precio +" Dolares";
    }
}
