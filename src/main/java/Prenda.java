import java.util.ArrayList;
import java.util.List;

public abstract class Prenda {
    protected String codigo;
    protected String marca;
    protected String nombre;
    protected double precio;

    //creacion lista
    private List<Prenda> listaPrendas;

    public Prenda(String codigo, String mercado, String nombre, double precio, String color) {
    public Prenda(String codigo, String marca, String nombre, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;

        //inicializar lista
        listaPrendas = new ArrayList<>();

    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }

    public abstract double calcularPrecioNeto();

    //Verificar que el codigo de prenda no esté repetido
    public boolean verificarCodigoPrenda(String codigo){
        boolean esRepetido = false;
        for(Prenda prenda: listaPrendas){
            if(prenda.getCodigo().equalsIgnoreCase(codigo)){
                esRepetido = true;
                break;
            }
        }
        return esRepetido;

        }
}
