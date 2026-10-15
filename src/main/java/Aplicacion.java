import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args){


        //Menú interactivo
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{




            switch(opcion){
                case 1:
                    //Registrar Prendas

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 12:
                    break;
                case 0:
                    // Salir
                    System.out.println("Programa finalizado.....");
                    break;
                default:
                    // Error en rojo
                    System.out.println( "\u001B[31m Opción no válida.\u001B[0m");



            }

        }while (opcion != 0);

        sc.close();

    }
}
