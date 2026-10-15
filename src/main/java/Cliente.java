public class Cliente extends Persona {
    private String codigoAfiliacion;
    private Categoria categoria;

    public Cliente(String documento, String nombre, String correo, String telefono, String codigoAfiliacion, Categoria categoria) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoria = categoria;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoAfiliacion='" + codigoAfiliacion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
