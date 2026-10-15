public class Pantalon extends Prenda{

    private final double RECARGA = 0;

    public Pantalon(String codigo, String mercado, String nombre, double precio ) {
        super(codigo, mercado, nombre, precio);
    }

    public double getRECARGA() {
        return RECARGA;
    }

    @Override
    public double calcularPrecioNeto() {
        return getPrecio()-(getPrecio()*RECARGA);
    }
}
