public class Camiseta extends Prenda{
    private TallaPrenda talla;
    private double recarga = 0;

    public Camiseta(String codigo, String mercado, String nombre, double precio, String color, TallaPrenda talla, double recarga) {
        super(codigo, mercado, nombre, precio, color);
        this.talla = talla;
        this.recarga = recarga;
    }

    public TallaPrenda getTalla() {
        return talla;
    }
    public void setTalla(TallaPrenda talla) {
        this.talla = talla;
    }

    public double getRecarga() {
        return recarga;
    }
    public void setRecarga(double recarga) {
        this.recarga = recarga;
    }

    @Override
    public double aplicarRecargas() {
        return 0;
    }
}
