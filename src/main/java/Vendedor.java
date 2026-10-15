import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;
    private Sucursal sucursal;

    private List<Venta> listaVentas;

    public Vendedor(String documento, String nombre, String correo, String telefono, String codigoEmpleado, LocalDate fechaContratacion, double salario, Sucursal sucursal) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.sucursal = sucursal;

        listaVentas = new ArrayList<>();
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString()+
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                '}';
    }

    // Modificar Vendedor

    // Eliminar Vendedor

    //Metoodo para agregar venta

    //Metodo para consultar ventas
}
