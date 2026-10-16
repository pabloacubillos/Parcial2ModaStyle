public class DetalleVenta {

    // Unidades compradas
    private int cantidad;
    //Precio por unidad después del recargo y el descuento
    private double precioUnitarioFinal;
    //Precio unitario final multiplicado por la cantidad.
    private double subtotal;

    public DetalleVenta(int cantidad, double precioUnitarioFinal, double subtotal) {
        this.cantidad = cantidad;
        this.precioUnitarioFinal = precioUnitarioFinal;
        this.subtotal = subtotal;
    }

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public double getPrecioUnitarioFinal() {return precioUnitarioFinal;}

    public void setPrecioUnitarioFinal(double precioUnitarioFinal) {
        this.precioUnitarioFinal = precioUnitarioFinal;}

    public double getSubtotal() {return subtotal;}

    public void setSubtotal(double subtotal) {this.subtotal = subtotal;}

    @Override
    public String toString() {
        return "DetalleVenta = " +
                "cantidad:" + cantidad +
                ", PrecioUnitarioFinal: " + precioUnitarioFinal +
                ", subtotal: " + subtotal + ". ";
    }
}
