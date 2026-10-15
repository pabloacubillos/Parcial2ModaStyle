public class Camiseta extends Prenda {
    private static final double RECARGA = 0.0;
    public Camiseta(String codigo, String marca, String nombre, double precio) {
        super(codigo, marca, nombre, precio);
    }

    public double getRECARGA() {
        return RECARGA;
    }

    public double calcularPrecioNeto() {
        return getPrecio()+(getPrecio()*RECARGA);
    }
}

