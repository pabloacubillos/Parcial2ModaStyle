import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
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

    public boolean verificarVenta (String codigoVenta){
        boolean existe = false;
        for (Venta venta : listaVentas){
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
            listaVentas.add(nuevaVenta);
            registroExitoso = true;
        } else {
            System.out.println("La venta ya existe dentro de la base de la base de datos, no es posible registrarla por segunda vez");
        }
        return registroExitoso;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                '}';
    }




}


    // Modificar Vendedor

    // Eliminar Vendedor

    //Metoodo para agregar venta

    //Metodo para consultar ventas

