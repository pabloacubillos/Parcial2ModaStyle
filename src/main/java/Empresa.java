import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Sucursal> listaSucursales;

    public Empresa(String nombre) {
        this.nombre = nombre;
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

    public List<Sucursal> getListaSucursales() {
        return listaSucursales;
    }
    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }



    }



