public class Chaqueta extends Prenda{

    private final double RECARGA = 0.15;
    public Chaqueta(String codigo, String mercado, String nombre, double precio) {
        super(codigo, mercado, nombre, precio);

    }



    public double getRECARGA() {
        return RECARGA;
    }

    @Override
    public double calcularPrecioNeto() {
        return getPrecio()+(getPrecio()*RECARGA);
    }
}
