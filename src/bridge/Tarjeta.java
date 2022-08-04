public class Tarjeta extends MetodoPago {

    public Tarjeta(Cuenta c){
        super(c);
    }
    @Override
    public String pagar(){
        System.out.print("Su cuenta fue "+cuenta.setCuenta());
        return null;
    }

}