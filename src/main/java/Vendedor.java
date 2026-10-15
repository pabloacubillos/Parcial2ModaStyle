import java.time.LocalDate;

public class Vendedor extends Persona{
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;

    public Vendedor(String documento, String nombre, String correo, String telefono, String codigoEmpleado, LocalDate fechaContratacion, double salario) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Vendedor{" + super.toString()+
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                '}';
    }
}
