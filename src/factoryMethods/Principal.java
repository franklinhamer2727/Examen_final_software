import  java.io.*;

class principal{
    public static void main(String[] args) throwns IOException{
        GetPedido ido = new GetPedido();


        System.out.println("Ingrese el nombre del pedido")
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String compra = br.readLine()
        System.out.println("Ingrese el numero de pedidos");
        int unidades =Integer.parseInt(br.readLine());

        Pedido p = ido.getPedido(compra);

        Sytem.out.print("su Pedido es  "+ido+"unidades : "+unidades);
        p.getPrecio();
        p.Calculator();
    
    }

}
