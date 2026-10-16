public class DetalleVenta {

    // Unidades compradas
    private int cantidad;
    //Precio por unidad después del recargo y el descuento
    private double precioUnitarioFinal;
    //Precio unitario final multiplicado por la cantidad.
    private double subtotal;

    private Venta venta;
    private Inventario inventario;

    public DetalleVenta(int cantidad, double precioUnitarioFinal, double subtotal, Venta venta, Inventario inventario) {
        this.cantidad = cantidad;
        this.precioUnitarioFinal = precioUnitarioFinal;
        this.subtotal = subtotal;
        this.venta = venta;
        this.inventario = inventario;
    }



    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public double getPrecioUnitarioFinal() {return precioUnitarioFinal;}
    public void setPrecioUnitarioFinal(double precioUnitarioFinal) {
        this.precioUnitarioFinal = precioUnitarioFinal;}

    public double getSubtotal() {return subtotal;}

    public void setSubtotal(double subtotal) {this.subtotal = subtotal;}

    public Venta getVenta() {return venta;}
    public void setVenta(Venta venta) {this.venta = venta;}

    public Inventario getInventario() {return inventario;}
    public void setInventario(Inventario inventario) {this.inventario = inventario;}

    @Override
    public String toString() {
        return "DetalleVenta = " +
                "cantidad:" + cantidad +
                ", PrecioUnitarioFinal: " + PrecioUnitarioFinal +
                ", subtotal: " + subtotal + ". ";
    }
}
