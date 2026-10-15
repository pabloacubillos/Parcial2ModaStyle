import java.util.Scanner;



public class Calzado extends Prenda {
    private int talla;
    private final double RECARGA = 0.05;

    public Calzado(String codigo, String mercado, String nombre, double precio, String color, int talla) {
        super(codigo, mercado, nombre, precio, color);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
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

    public double getRECARGA() {
        return RECARGA;
    }

    @Override
    public double calcularPrecioNeto() {
        return getPrecio()-(getPrecio()*RECARGA);
    }
}
