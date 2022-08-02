import java.io.*;

abstract class Pedido{
    protected double precio;
    abstract void getPrecio();
    public void Calculator(int unidades){
        //se multimplca el numero de unidades por el precio del producto
        System.out.println(unidades*precio);
    }
}