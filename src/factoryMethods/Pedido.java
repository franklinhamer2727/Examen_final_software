import java.io.*;

abstract class Pedido{
    protected double precio;
    abstract void getPrecio();
    public void Calculator(int unidades) {
        System.out.println(unidades*precio +" Dolares");
    }
}
