import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccionPrincipal;

    private List<Sucursal> listaSucursales;
    private List<Cliente> listaClientes;
    //creacion lista
    private List<Prenda> listaPrendas;


    public Empresa(String nombre, String nit, String direccionPrincipal) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccionPrincipal = direccionPrincipal;

        listaSucursales = new ArrayList<>();
        listaClientes = new ArrayList<>();
        //inicializar lista
        listaPrendas = new ArrayList<>();
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

    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }
    //Verificar que el codigo de prenda no esté repetido
    public boolean verificarCodigoPrenda(String codigo) {
        boolean esRepetido = false;
        for (Prenda prenda : listaPrendas) {
            if (prenda.getCodigo().equalsIgnoreCase(codigo)) {
                esRepetido = true;
                break;
            }
        }
        return esRepetido;
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

    //Agregar prenda a la lista
    public void agregarPrenda(Prenda prenda) {
        listaPrendas.add(prenda);
    }

    public Sucursal buscarSucursal(String codigo) {
        for (Sucursal sucursal : listaSucursales) {
            if (sucursal.getCodigo().equalsIgnoreCase(codigo)) {
                return sucursal;
            }
        }
        return null;
    }
//registrar sucursal
    public void agregarSucursal(Sucursal sucursal) {
        listaSucursales.add(sucursal);
    }
}
