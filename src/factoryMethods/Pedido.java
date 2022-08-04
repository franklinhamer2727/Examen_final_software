abstract class Pedido{
    protected double precio;
    abstract String getPrecio();
    public void Calculator(int unidades) {
        System.out.println(unidades*precio +" Dolares");
    }
}