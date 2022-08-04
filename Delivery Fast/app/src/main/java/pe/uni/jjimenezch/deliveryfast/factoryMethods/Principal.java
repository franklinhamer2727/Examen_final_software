package pe.uni.jjimenezch.deliveryfast.factoryMethods;

import  java.io.*;
import java.util.Objects;

import pe.uni.jjimenezch.deliveryfast.Command.GestorTareas;
import pe.uni.jjimenezch.deliveryfast.Command.Plato;
import pe.uni.jjimenezch.deliveryfast.Command.SuperTarea;
import pe.uni.jjimenezch.deliveryfast.Command.TareaListarPlato;
import pe.uni.jjimenezch.deliveryfast.Command.TareaRegistrarPlato;
import pe.uni.jjimenezch.deliveryfast.bridge.Consumo;
import pe.uni.jjimenezch.deliveryfast.bridge.Efectivo;
import pe.uni.jjimenezch.deliveryfast.bridge.MetodoPago;
import pe.uni.jjimenezch.deliveryfast.bridge.Tarjeta;

class principal{
    /*
    public static void main(String[] args) throws IOException {
        GetPedido ido = new GetPedido();


        System.out.println("Seleccione el tipo de plato: ");
        System.out.println("Carta");
        System.out.println("Menu");
        System.out.println("Ingrese sus respuesta:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String compra = br.readLine();
        System.out.println("Cuantos pedidos: ");
        int unidades =Integer.parseInt(br.readLine());

        Pedido p = ido.getPedido(compra);

        System.out.print("Su cuenta es:");
        p.getPrecio();
        p.Calculator(unidades);


        //Command
        SuperTarea st= new SuperTarea();
        st.addTarea(new TareaRegistrarPlato());
        st.addTarea(new TareaListarPlato());
        System.out.println("Ingrese su pedido");
        String pedido = br.readLine();

        GestorTareas gt= new GestorTareas();
        Plato pla= new Plato(1,pedido);

        gt.ejecutar(st, pla);

        //bridge

        System.out.println("Como Desea cancelar : ");
        System.out.println("1) Targeta");
        System.out.println("2) Efectivo");
        System.out.println("Seleccione una opcion:");
        String opcion = br.readLine();
        if (Objects.equals(opcion, "Targeta")){
            MetodoPago pa = new Tarjeta(new Consumo());
            pa.pagar();
            System.out.println("Gracias por su visita!!!!");

        }
        else{
            MetodoPago pa = new Efectivo(new Consumo());
            pa.pagar();
            System.out.println("   Gracias por su visita!!!!");
        }

    }*/
}
