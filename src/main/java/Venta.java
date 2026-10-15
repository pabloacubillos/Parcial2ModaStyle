import java.time.LocalDate;

public class Venta {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private Vendedor vendedor;
    private Sucursal sucursal;

    public Venta(String codigo, LocalDate fecha, Cliente cliente, Vendedor vendedor, Sucursal sucursal) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.sucursal = sucursal;
    }

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public LocalDate getFecha() {return fecha;}

    public void setFecha(LocalDate fecha) {this.fecha = fecha;}

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "\nVenta = " +
                "codigo: " + codigo +
                ", fecha: " + fecha + ". ";
    }
}
