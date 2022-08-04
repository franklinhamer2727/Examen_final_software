package pe.uni.jjimenezch.deliveryfast.bridge;

public class Efectivo extends MetodoPago {

    public Efectivo(Cuenta c){
        super(c);
    }
    @Override
    public void pagar(){
        System.out.print("Su cuenta fue cobrada en "+cuenta.setCuenta());
    }

}
