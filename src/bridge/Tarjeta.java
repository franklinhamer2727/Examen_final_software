public class Tarjeta extends MetodoPago {
    /*public String paCalculatorgar(Cuenta cuenta) {
        //super(cuenta);
        return "";
    }*/

    @Override
    public String pagar() {
        return "Gracias por su visita su cuenta fue" + cuenta.pagar();
    }
}