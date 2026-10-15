public abstract class Prenda {
    private String codigo;
    private String mercado;
    private String nombre;
    private double precio;
    private String color;

    public Prenda(String codigo, String mercado, String nombre, double precio, String color) {
        this.codigo = codigo;
        this.mercado = mercado;
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;

    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMercado() {
        return mercado;
    }
    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double aplicarRecarga();
}
