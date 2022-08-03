public class Efectivo extends MetodoPago{
    /*
    public String pagar(){

        //super(cuenta);
        return "";
    }*/
    @Override
    public String pagar(){
        return "Gracias por su visita su cuenta fue"+cuenta.pagar();
    }
}