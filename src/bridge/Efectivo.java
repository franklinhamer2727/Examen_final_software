public class Efectivo extends MetodoPago {

    public Efectivo(Cuenta c){
        super(c);
    }
    @Override
    public String pagar(){
        System.out.print("Su cuenta fue cobrada en "+cuenta.setCuenta());
        return null;
    }

}