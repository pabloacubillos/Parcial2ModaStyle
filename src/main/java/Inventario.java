public class Inventario {
    private Prenda prenda;
    private Sucursal sucursal;
    private String talla;
    private String color;
    private int cantidadDisponible;
    private Prenda prendaAsociada;


    public Inventario(Prenda prenda, Sucursal sucursal, String talla, String color,
                      int cantidadDisponible) {
        this.prenda = prenda;
        this.sucursal = sucursal;
        this.talla = talla;
        this.color = color;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Inventario= " +
                "prenda: " + prenda +
                ", sucursal: " + sucursal +
                ", talla: " + talla +
                ", color: " + color +
                ", cantidadDisponible: " + cantidadDisponible + ". ";

    }
}

    // Base metodo para verificar talla
    /*     public void setTalla(int talla) {
        Scanner sc = new Scanner(System.in);
        while(true){
            if (35 <= talla && talla <= 44){
                this.talla = talla;
                break;
            } else {
                System.out.println("Esta talla no es valida, elige una talla entre 35 y 44:");
                talla = sc.nextInt();
            }
        }
    }
}
     */
