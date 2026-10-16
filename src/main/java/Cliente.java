import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigoAfiliacion;
    private Categoria categoria;

    private List<Venta> listaComprasCliente;

    public Cliente(String documento, String nombre, String correo, String telefono, String codigoAfiliacion, Categoria categoria) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoria = categoria;
        listaComprasCliente = new ArrayList<>();
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

    public List<Venta> getListaComprasCliente() {
        return listaComprasCliente;
    }
    public void setListaComprasCliente(List<Venta> listaComprasCliente) {
        this.listaComprasCliente = listaComprasCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString()+
                "codigoAfiliacion='" + codigoAfiliacion + '\'' +
                ", categoria=" + categoria +
                '}';
    }

    public boolean verificarVenta (String codigoVenta){
        boolean existe = false;
        for (Venta venta : listaComprasCliente){
            if (venta.getCodigo().equalsIgnoreCase(codigoVenta)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean registrarVenta (Venta nuevaVenta){
        boolean registroExitoso = false;
        boolean estaRegistrada = verificarVenta(nuevaVenta.getCodigo());
        if (!estaRegistrada){
            listaComprasCliente.add(nuevaVenta);
            registroExitoso = true;
        } else {
            System.out.println("La venta ya existe dentro de la base de la base de datos, no es posible registrarla por segunda vez");
        }
        return registroExitoso;
    }
}
