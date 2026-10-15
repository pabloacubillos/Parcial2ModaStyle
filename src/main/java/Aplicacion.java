import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args){


        //Menú interactivo
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n===== MENÚ MODASTYLE =====");

            System.out.println("\n===== REGISTROS =====");
            System.out.println("1. Registrar prenda");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Registrar vendedor");
            System.out.println("4. Registrar existencias en una sucursal");

            System.out.println("\n===== VENTAS =====");
            System.out.println("5. Registrar venta");
            System.out.println("6. Consultar total de una venta");

            System.out.println("\n===== CONSULTAS =====");
            System.out.println("7. Consultar prendas disponibles de una sucursal");
            System.out.println("8. Consultar prendas agotadas");
            System.out.println("9. Consultar ventas de un vendedor");
            System.out.println("10. Consultar compras de un cliente");

            System.out.println("\n===== REPORTES =====");
            System.out.println("11. Calcular ingresos de una sucursal");
            System.out.println("12. Ver la referencia más vendida");

            System.out.println("\n0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();


            switch(opcion){
                case 1:
                    //Registrar Prendas
                    System.out.println("=====Registrar prenda=====");

                    break;
                case 2:
                    //Registrar Cliente
                    System.out.println("Ingresa el numero de documento del cliente");
                    String documentoCliente = sc.nextLine();
                    String nombre = sc.nextLine();
                    String correo = sc.nextLine();
                    String telefono = sc.nextLine();
                    String codigoAfiliacion = sc.nextLine();

                    System.out.println("Elige el numero de la categoria a la que pertenece el cliente:" +
                            "\n0. Ninguno" +
                            "\n1. Broce" +
                            "\n2. Plata" +
                            "\n3. Oro");

                    switch (opcion){
                        case 0:
                    }

                    Cliente nuevoCliente = new Cliente(documentoCliente, nombre, correo, telefono, codigoAfiliacion)
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
