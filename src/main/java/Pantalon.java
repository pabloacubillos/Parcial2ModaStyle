public class Pantalon extends Prenda{

    private TallaPrenda talla;
    private final double RECARGA = 0;

    public Pantalon(String codigo, String mercado, String nombre, double precio, String color, TallaPrenda talla) {
        super(codigo, mercado, nombre, precio, color);
        this.talla = talla;
    }

    public TallaPrenda getTalla() {
        return talla;
    }
    public void setTalla(TallaPrenda talla) {
        this.talla = talla;
    }

    public double getRECARGA() {
        return RECARGA;
    }

    @Override
    public double calcularPrecioNeto() {
        return getPrecio()-(getPrecio()*RECARGA);
    }
}
