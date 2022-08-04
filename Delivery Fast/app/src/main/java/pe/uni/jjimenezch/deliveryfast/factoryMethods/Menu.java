package pe.uni.jjimenezch.deliveryfast.factoryMethods;

import java.io.Serializable;

class Menu extends Pedido{

    Menu(){
        precio = 15.00;
    }
    @Override
    public void getPrecio(){
        precio = 15.00;
    }
}