package pe.uni.jjimenezch.deliveryfast.factoryMethods;

import java.io.*;


public class GetPedido{
    public Pedido getPedido(String namePedido){
        if (namePedido == null){
            return null;
        }
        if(namePedido.equalsIgnoreCase("Menu")){
            return new Menu();
        }
        else  if(namePedido.equalsIgnoreCase("Carta")){
            return new Carta();
        }
    return null;

    }
}