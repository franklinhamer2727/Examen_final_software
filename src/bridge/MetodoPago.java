public abstract class MetodoPago{
    protected Cuenta cuenta;
    //standards constructores

    public MetodoPago(Cuenta c){
        this.cuenta = c;
    }
    abstract  public String pagar();
}