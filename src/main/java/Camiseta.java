public class Camiseta extends Prenda{
    private TallaPrenda talla;
    private double RECARGA = 0;

    public Camiseta(String codigo, String mercado, String nombre, double precio, String color, TallaPrenda talla) {
        super(codigo, mercado, nombre, precio, color);
        this.talla = talla;
    }

    public TallaPrenda getTalla() {
        return talla;
    }
    public void setTalla(TallaPrenda talla) {
        this.talla = talla;
    }



    @Override
    public double aplicarRecarga() {
        return getPrecio();
    }
}
