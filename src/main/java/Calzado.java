public class Calzado extends Prenda {

    private int talla;
    private final double RECARGA = 0.05;

    public Calzado(String codigo, String mercado, String nombre, double precio, String color, int talla) {
        super(codigo, mercado, nombre, precio, color);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
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
