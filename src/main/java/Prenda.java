import java.util.ArrayList;
import java.util.List;

public abstract class Prenda {
    private String codigo;
    private String marca;
    private String nombre;
    private double precio;

    private List<Inventario> listaInventarios;



    public Prenda(String codigo, String marca, String nombre, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;

        listaInventarios = new ArrayList<>();

    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public List<Inventario> getListaInventarios() {
        return listaInventarios;
    }
    public void setListaInventarios(List<Inventario> listaInventarios) {
        this.listaInventarios = listaInventarios;
    }

    public abstract double calcularPrecioNeto();



        }

