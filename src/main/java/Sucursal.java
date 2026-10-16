import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private Empresa empresa;
    private List<Inventario> listaInventarios;
    private List<Vendedor> listaVendedores;
    private List<Venta> listaVentas;
    private List<Cliente> listaClientes;

    public Sucursal(String codigo, String nombre, String direccion, String ciudad, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.empresa = empresa;

        listaInventarios = new ArrayList<>();
        listaVendedores = new ArrayList<>();
        listaVentas = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Inventario> getListaInventarios() {
        return listaInventarios;
    }
    public void setListaInventarios(List<Inventario> listaInventarios) {
        this.listaInventarios = listaInventarios;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }
    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Verificar Cliente

    public boolean verificarCliente (String documentoCliente){
        boolean existe = false;
        for (Cliente cliente : listaClientes){
            if (cliente.getDocumento().equalsIgnoreCase(documentoCliente)){
                existe = true;
                break;
            }
        }
        return existe;
    }

    //Registrar Cliente

    public boolean registrarCliente (Cliente clienteNuevo){
        boolean registroExitoso = false;
        boolean estaRegistrado = verificarCliente(clienteNuevo.getDocumento());
        if (!estaRegistrado){
            listaClientes.add(clienteNuevo);
            registroExitoso = true;
        } else {
            System.out.println("El cliente ya existe dentro de la base de la base de datos, no es posible registrarlo por segunda vez");
        }
        return registroExitoso;
    }

    //Mostrar Clientes

    public void mostrarClientes(){
        for(Cliente cliente : listaClientes){
            System.out.println("\n\n" + cliente.toString());
        }
    }

    @Override
    public String toString() {
        return "\nSucursal = " +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", direccion: " + direccion +
                ", ciudad: " + ciudad + ". ";
    }

    // Metodo Agregar vendedor
}
