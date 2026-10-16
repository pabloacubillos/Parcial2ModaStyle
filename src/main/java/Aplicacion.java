import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args){
        Empresa empresa = new Empresa("ModaStyle", "901234567-8","Armenia, Quindío" );

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

                    System.out.print("Ingrese el codigo de la prenda: ");
                    String codigo = sc.nextLine();

                    if (empresa.verificarCodigoPrenda(codigo)) {
                        System.out.println("Error: ese codigo ya existe.");
                        break;
                    }

                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Seleccione el tipo de prenda:");
                    System.out.println("1. Camiseta");
                    System.out.println("2. Pantalon");
                    System.out.println("3. Vestido");
                    System.out.println("4. Chaqueta");
                    System.out.println("5. Calzado");

                    System.out.print("Opcion: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();


                    break;
                case 2:
                    //Registrar Cliente
                    System.out.println("Ingresa el numero de documento del cliente");
                    String documentoCliente = sc.nextLine();

                    boolean documentoValido = empresa.verificarCliente(documentoCliente);
                    if(documentoValido){
                        System.out.println("Este documento es de un cliente ya registrado");
                        break;
                    }

                    System.out.println("Ingresa el nombre del cliente");
                    String nombreCliente = sc.nextLine();

                    System.out.println("Ingresa el correo electronico del cliente");
                    String correoCliente = sc.nextLine();

                    System.out.println("Ingresa el numero de telefono del cliente");
                    String telefonoCliente = sc.nextLine();

                    System.out.println("Ingresa el codigo de afiliacion del cliente");
                    String codigoAfiliacionCliente = sc.nextLine();

                    Categoria categoriaCliente = null;

                    System.out.println("Ingresa el numero correspondiente la categoria a la que se desea registrar el cliente:" +
                            "\n0. No tiene" +
                            "\n1. Broce" +
                            "\n2. Plata" +
                            "\n3. Oro");
                    int opcionCategoria = sc.nextInt();
                    do {
                        switch (opcionCategoria) {
                            case 0:
                                categoriaCliente = null;
                                break;

                            case 1:
                                categoriaCliente = Categoria.BRONCE;
                                break;

                            case 2:
                                categoriaCliente = Categoria.PLATA;
                                break;

                            case 3:
                                categoriaCliente = Categoria.ORO;
                                break;

                            default:
                                System.out.println("Esta opcion es INVALIDA, ingrese una opcion valida");
                        }
                    } while(0 > opcionCategoria || opcionCategoria > 4);

                    Cliente nuevoCliente = new Cliente(documentoCliente, nombreCliente, correoCliente, telefonoCliente, codigoAfiliacionCliente, categoriaCliente);
                    boolean clienteRegistrado = empresa.registrarCliente(nuevoCliente);
                    if (clienteRegistrado){
                        System.out.println("El cliente se registro correctamente");
                    } else {
                        System.out.println("El cliente no pudo registrarse en el sistema");
                    }
                    break;
                case 3:


                    // Registrar un vendedor
                    System.out.println(" === INGRESAR UN VENDEDOR ===");
                    System.out.println("Ingresa el numero de documento del vendedor");
                    String documentoVendedor = sc.nextLine();

                    System.out.println("Ingresa el nombre del vendedor");
                    String nombreVendedor = sc.nextLine();

                    System.out.println("Ingresa el correo electronico del vendedor");
                    String correoVendedor = sc.nextLine();

                    System.out.println("Ingresa el numero de telefono del vendedor");
                    String telefonoVendedor = sc.nextLine();

                    System.out.println("Ingresa el codigo del vendedor");
                    String codigoVendedor = sc.nextLine();

                    System.out.println("A continuacion, ingrese la fecha de contratación " +
                            "del vendedor");

                    System.out.println("-Año: ");
                    int anio = sc.nextInt();

                    System.out.println("-Mes: ");
                    int mes = sc.nextInt();

                    System.out.println("-Dia: ");
                    int dia = sc.nextInt();
                    LocalDate fechaContratacin = LocalDate.of(anio, mes, dia);
                    sc.nextLine();

                    System.out.println("Ingrese el salario del vendedor: ");
                    double salario = sc.nextDouble();







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
