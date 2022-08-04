package pe.uni.jjimenezch.deliveryfast.factoryMethods;

import java.io.Serializable;

class Carta extends Pedido {

    Carta(){
        precio = 25.00;
    }
    @Override
    public void getPrecio(){
        precio = 25.00;
    }
}