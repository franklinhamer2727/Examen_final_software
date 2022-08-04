package pe.uni.jjimenezch.deliveryfast.factoryMethods;

import java.io.Serializable;

public abstract class Pedido implements Serializable {
    public double precio;
    abstract void getPrecio();
    public String Calculator(int unidades) {
        return unidades*precio +" Dolares";
    }
}

