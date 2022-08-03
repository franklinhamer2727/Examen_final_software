public class Consumo implements Cuenta {
    @Override
    public int monto() {
        return 23;
    }

    @Override
    public String pagar() {
        return null;
    }
}