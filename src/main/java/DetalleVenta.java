public class DetalleVenta {

    // Unidades compradas
    private int cantidad;
    //Precio por unidad después del recargo y el descuento
    private double PrecioUnitarioFinal;
    //Precio unitario final multiplicado por la cantidad.
    private double subtotal;
    private Prenda prenda;
    public DetalleVenta(int cantidad, double precioUnitarioFinal, double subtotal, Prenda prenda) {
        this.cantidad = cantidad;
        PrecioUnitarioFinal = precioUnitarioFinal;
        this.subtotal = subtotal;

    }



    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public double getPrecioUnitarioFinal() {return PrecioUnitarioFinal;}

    public void setPrecioUnitarioFinal(double precioUnitarioFinal) {PrecioUnitarioFinal = precioUnitarioFinal;}

    public double getSubtotal() {return subtotal;}

    public void setSubtotal(double subtotal) {this.subtotal = subtotal;}

    @Override
    public String toString() {
        return "DetalleVenta = " +
                "cantidad:" + cantidad +
                ", PrecioUnitarioFinal: " + PrecioUnitarioFinal +
                ", subtotal: " + subtotal + ". ";
    }
}
