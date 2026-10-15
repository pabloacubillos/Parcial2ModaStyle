import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigoAfiliacion;
    private Categoria categoria;

    private List<Venta> comprasCliente;

    public Cliente(String documento, String nombre, String correo, String telefono, String codigoAfiliacion, Categoria categoria) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoria = categoria;
        comprasCliente = new ArrayList<>();
    }

    public String getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(String codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Venta> getComprasCliente() {
        return comprasCliente;
    }
    public void setComprasCliente(List<Venta> comprasCliente) {
        this.comprasCliente = comprasCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString()+
                "codigoAfiliacion='" + codigoAfiliacion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
