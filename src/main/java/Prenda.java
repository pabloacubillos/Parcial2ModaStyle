import java.util.ArrayList;
import java.util.List;

public abstract class Prenda {
    protected String codigo;
    protected String marca;
    protected String nombre;
    protected double precio;



    public Prenda(String codigo, String marca, String nombre, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;



    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }



    public abstract double calcularPrecioNeto();



        }

