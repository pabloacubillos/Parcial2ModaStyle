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

    public Sucursal(String codigo, String nombre, String direccion, String ciudad, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.empresa = empresa;

        listaInventarios = new ArrayList<>();
        listaVendedores = new ArrayList<>();
        listaVentas = new ArrayList<>();

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



    @Override
    public String toString() {
        return "\nSucursal = " +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", direccion: " + direccion +
                ", ciudad: " + ciudad + ". ";
    }
    // Metodo para verificar vendedor

    public boolean verificarVendedor(String documentoVendedor) {
        boolean existe = false;
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getDocumento().equalsIgnoreCase(documentoVendedor)) {
                existe = true;
                break;

            }
        }
        return existe;
    }

    // Metodo registrar vendedor

    public boolean registrarVendedor(Vendedor vendedorNuevo, String codigoSucursal, Empresa miEmpresa) {
        boolean registroExitoso = false;
        boolean estaRegistrado = verificarVendedor(vendedorNuevo.getDocumento());
        boolean sucursalExiste = miEmpresa.encontrarSucursal(codigoSucursal);
        if (estaRegistrado) {
            System.out.println("el vendedor con este documento ya existe");
        } else if (!sucursalExiste) {
            System.out.println("La sucursal con el codigo" + codigoSucursal +
                    " no existe en la base de datos");
        } else {
            Sucursal sucursalAsociada = miEmpresa.obtenerSucursal(codigoSucursal);
            vendedorNuevo.setSucursal(sucursalAsociada);

            listaVendedores.add(vendedorNuevo);
            registroExitoso = true;
            System.out.println("Registro exitoso");

        }
        return registroExitoso;
    }

    public Vendedor obtenerVendedor(String documentoVendedor) {
        Vendedor vendedorEncontrado = null;

        for (Vendedor v : listaVendedores) {
            if (v.getDocumento().equals(documentoVendedor)) {
                vendedorEncontrado = v;
                break;
            }
        }

        return vendedorEncontrado;
    }


    public void mostrarPrendasDisponibles() {
        boolean hayPrendas = false;

        for (Inventario inventario : listaInventarios) {
            if (inventario.getCantidadDisponible() > 0) {
                System.out.println(
                        "Prenda: " + inventario.getPrenda().getNombre()
                                + " | Talla: " + inventario.getTalla()
                                + " | Color: " + inventario.getColor()
                                + " | Cantidad: " + inventario.getCantidadDisponible()
                );

                hayPrendas = true;
            }
        }

        if (!hayPrendas) {
            System.out.println("Esta sucursal no tiene prendas disponibles.");
        }
    }
    }




