import java.io.*;


class GetPedido{
    public Pedido getPedido(String namePedido){
        if (namePedido == null){
            return null;
        }
        if(namePedido.equalsIgnoreCase('Menu')){
            return  Menu();
        }
        else  if(namePedido.equalsIgnoreCase('Carta')){
            return  Carta();
        }
    return null;

    }
}