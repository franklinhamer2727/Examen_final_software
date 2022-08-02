public class Efectivo extends MetodoPago{
    public pagar(Cuenta cuenta){
        super(cuenta);
    }
    @Override
    public String pagar(){
        return "Gracias por su visita su cuenta fue"+cuenta.pagar();
    }
}