import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccionPrincipal;

    private List<Sucursal> listaSucursales;

    public Empresa(String nombre, String nit, String direccionPrincipal) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccionPrincipal = direccionPrincipal;

        listaSucursales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }
    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public List<Sucursal> getListaSucursales() {
        return listaSucursales;
    }
    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }



    }



