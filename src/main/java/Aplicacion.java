import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aplicacion {
    public static void main (String[] args){
        //Creacion objeto empresa
        Empresa empresa = new Empresa("ModaStyle", "901234567-8","Armenia, Quindío" );
        //Creación objeto(2) sucursal

        Sucursal sucursal1 = new Sucursal("S01", "Sucursal Centro", "Carrera 14", "Armenia", empresa);

        Sucursal sucursal2 = new Sucursal("S02", "Sucursal Norte", "Avenida Bolivar", "Armenia", empresa);

        //Agregar sucursales a empresa
        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);






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


            switch(opcion) {
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
                    System.out.println("2. Pantalón");
                    System.out.println("3. Vestido");
                    System.out.println("4. Chaqueta");
                    System.out.println("5. Calzado");

                    System.out.print("Opcion: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Prenda prenda = null;

                    switch (tipo) {
                        case 1:
                            prenda = new Camiseta(codigo, marca, nombre, precio);
                            break;

                        case 2:
                            prenda = new Pantalon(codigo, marca, nombre, precio);
                            break;

                        case 3:
                            prenda = new Vestido(codigo, marca, nombre, precio);
                            break;

                        case 4:
                            prenda = new Chaqueta(codigo, marca, nombre, precio);
                            break;

                        case 5:
                            prenda = new Calzado(codigo, marca, nombre, precio);
                            break;

                        default:
                            System.out.println("Tipo de prenda no valido.");
                            break;
                    }
                    if (prenda != null) {
                        empresa.agregarPrenda(prenda);
                        System.out.println("Prenda registrada correctamente.");
                    }


                    break;
                case 2:
                    //Registrar Cliente
                    System.out.println("Ingresa el numero de documento del cliente");
                    String documentoCliente = sc.nextLine();

                    boolean documentoValido = empresa.verificarCliente(documentoCliente);
                    if (documentoValido) {
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
                    } while (0 > opcionCategoria || opcionCategoria > 4);

                    Cliente nuevoCliente = new Cliente(documentoCliente, nombreCliente, correoCliente, telefonoCliente, codigoAfiliacionCliente, categoriaCliente);
                    boolean clienteRegistrado = empresa.registrarCliente(nuevoCliente);
                    if (clienteRegistrado) {
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
                    LocalDate fechaContratacion = LocalDate.of(anio, mes, dia);
                    sc.nextLine();

                    System.out.println("Ingrese el salario del vendedor: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    int opcionSucursal;
                    String codigoSucursalVendedor = "";

                    do {
                        System.out.println("Ingrese el numero correspondiente de la sucursal a la que pertenecera el vendedor:");
                        System.out.println("1. Sucursal codigo S01");
                        System.out.println("2. Sucursal codigo S02");
                        System.out.print("Seleccione una opción: ");

                        opcionSucursal = sc.nextInt();
                        sc.nextLine();

                        switch (opcionSucursal) {
                            case 1:
                                codigoSucursalVendedor = "S01";
                                break;

                            case 2:
                                codigoSucursalVendedor = "S02";
                                break;
                            default:
                                System.out.println("Esta opcion es INVALIDA");

                        }
                    } while (opcionSucursal < 1 || opcionSucursal > 2);

                    Vendedor nuevoVendedor = new Vendedor(documentoVendedor, nombreVendedor, correoVendedor,
                            telefonoVendedor, codigoVendedor, fechaContratacion,
                            salario, null);

                    Sucursal sucursalElegida = empresa.obtenerSucursal(codigoSucursalVendedor);
                    sucursalElegida.registrarVendedor(nuevoVendedor, codigoSucursalVendedor, empresa);
                    break;


                case 4: {
                    System.out.println("===== REGISTRAR EXISTENCIAS =====");

                    System.out.print("Ingrese el codigo de la prenda: ");
                    String codigoPrenda = sc.nextLine();

                    Prenda prendaSeleccionada = null;

                    for (Prenda prendaRecorrida : empresa.getListaPrendas()) {
                        if (prendaRecorrida.getCodigo().equalsIgnoreCase(codigoPrenda)) {
                            prendaSeleccionada = prendaRecorrida;
                            break;
                        }
                    }

                    if (prendaSeleccionada == null) {
                        System.out.println("No existe una prenda con ese codigo.");
                        break;
                    }

                    System.out.print("Ingrese el codigo de la sucursal (S01 o S02): ");
                    String codigoSucursalExistencias = sc.nextLine();

                    Sucursal sucursalExistencias = empresa.obtenerSucursal(codigoSucursalExistencias);

                    if (sucursalExistencias == null) {
                        System.out.println("No existe una sucursal con ese codigo.");
                        break;
                    }

                    System.out.println("Tallas disponibles:");
                    for (TallaPrenda tallaRecorrida : TallaPrenda.values()) {
                        System.out.println(tallaRecorrida);
                    }

                    System.out.print("Ingrese la talla: ");
                    String textoTalla = sc.nextLine().toUpperCase();

                    TallaPrenda tallaSeleccionada;

                    try {
                        tallaSeleccionada = TallaPrenda.valueOf(textoTalla);
                    } catch (IllegalArgumentException e) {
                        System.out.println("La talla ingresada no es valida.");
                        break;
                    }

                    System.out.print("Ingrese el color: ");
                    String colorExistencias = sc.nextLine();

                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidadExistencias;

                    try {
                        cantidadExistencias = Integer.parseInt(sc.nextLine());

                        if (cantidadExistencias <= 0) {
                            System.out.println("La cantidad debe ser mayor que cero.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar una cantidad numerica.");
                        break;
                    }

                    Inventario nuevoInventario = new Inventario(
                            prendaSeleccionada,
                            sucursalExistencias,
                            tallaSeleccionada,
                            colorExistencias,
                            cantidadExistencias
                    );

                    sucursalExistencias.agregarInventario(nuevoInventario);

                    System.out.println("Existencias registradas correctamente.");
                    break;
                }


                case 5: {
                    System.out.println("\n===== REGISTRAR VENTA =====");

                    String codigoSucursalVenta = "";
                    int sucursalElegidaVenta;

                    do {
                        System.out.println("Ingrese el número de la sucursal donde se realizará la venta:");
                        System.out.println("1. Sucursal código S01");
                        System.out.println("2. Sucursal código S02");
                        System.out.print("Seleccione una opción: ");

                        sucursalElegidaVenta = sc.nextInt();
                        sc.nextLine();

                        switch (sucursalElegidaVenta) {
                            case 1:
                                codigoSucursalVenta = "S01";
                                break;
                            case 2:
                                codigoSucursalVenta = "S02";
                                break;
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (sucursalElegidaVenta < 1 || sucursalElegidaVenta > 2);

                    Sucursal sucursalVenta = empresa.obtenerSucursal(codigoSucursalVenta);

                    System.out.print("Ingresa el documento del vendedor que realiza la venta: ");
                    String documentoVendedorVenta = sc.nextLine();

                    if (!sucursalVenta.verificarVendedor(documentoVendedorVenta)) {
                        System.out.println("El vendedor no existe en esta sucursal.");
                        break;
                    }
                    Vendedor vendedorVenta = sucursalVenta.obtenerVendedor(documentoVendedorVenta);

                    System.out.print("Ingresa el documento del cliente: ");
                    String documentoClienteVenta = sc.nextLine();

                    if (!empresa.verificarCliente(documentoClienteVenta)) {
                        System.out.println("El cliente no está registrado. Para realizar la venta, primero se debe registrar al cliente.");
                        break;
                    }

                    Cliente comprador = empresa.buscarCliente(documentoClienteVenta);

                    System.out.print("Ingresa el código de la venta: ");
                    String codigoVenta = sc.nextLine();

                    LocalDate fechaVenta = LocalDate.now();

                    Venta ventaActual = new Venta(codigoVenta, fechaVenta, comprador, vendedorVenta, sucursalVenta);

                    System.out.print("Ingresar la cantidad de diferentes prendas que se vendera: ");
                    int cantidadProductos = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < cantidadProductos; i++) {
                        System.out.println("\nProducto: " + (i + 1));
                        System.out.print("Ingresa el codigo de la prenda: ");
                        String codigoPrenda = sc.nextLine();

                        Prenda prendaComprada = sucursalVenta.obtenerPrenda(codigoPrenda);


                        if (prendaComprada != null) {
                            System.out.print("Ingresa la cantidad comprada: ");
                            int cantidadComprada = sc.nextInt();
                            sc.nextLine();

                            double precioFinal = prendaComprada.getPrecio();
                            double subtotal = precioFinal * cantidadComprada;

                            int opcionTalla = 0;
                            TallaPrenda tallaPrenda = null;

                            do {
                                System.out.println("Selecciona la talla de la prenda:" +
                                        "\n1. XS" +
                                        "\n2. S" +
                                        "\n3. L" +
                                        "\n4. M" +
                                        "\n5. XL");
                                opcionTalla = sc.nextInt();

                                switch (opcionTalla) {
                                    case 1:
                                        tallaPrenda = TallaPrenda.XS;
                                        break;

                                    case 2:
                                        tallaPrenda = TallaPrenda.S;
                                        break;

                                    case 3:
                                        tallaPrenda = TallaPrenda.L;
                                        break;

                                    case 4:
                                        tallaPrenda = TallaPrenda.M;
                                        break;

                                    case 5:
                                        tallaPrenda = TallaPrenda.XL;
                                        break;

                                    default:
                                        System.out.println("Esta opcion no es valida");
                                        opcionTalla = 0;
                                }
                            }while(opcionTalla == 0);

                            System.out.println("Ingresa el color de la prenda:");
                            String color = sc.nextLine();

                            System.out.println("Ingresar la cantidad disponible de esta prenda:");
                            int cantidadDisponible = sc.nextInt();

                            Inventario inventario = new Inventario(prendaComprada, sucursalVenta, tallaPrenda, color, cantidadDisponible);
                            DetalleVenta detalle = new DetalleVenta(cantidadComprada, precioFinal, subtotal, ventaActual, inventario);

                            ventaActual.getListaDetalles().add(detalle);
                        } else {
                            System.out.println("La prenda no existe. No se pudo agregar este detalle.");
                        }
                    }
                    comprador.registrarVenta(ventaActual);
                    vendedorVenta.registrarVenta(ventaActual);
                    sucursalVenta.registrarVenta(ventaActual);

                    System.out.println("Venta registrada con exito");
                    break;
                }
                case 6:
                    // Consultar total de una venta
                    System.out.println("\n===== CONSULTAR TOTAL DE UNA VENTA =====");

                    int suc;
                    String codigoSuc = "";

                    do {
                        System.out.println("Ingrese el el numero de la sucursal a la cual quiere consultar " +
                                    "la venta.");
                        System.out.println("1. Sucursal codigo S01");
                        System.out.println("2. Sucursal codigo S02");
                        System.out.print("Seleccione una opción: ");

                        suc = sc.nextInt();
                        sc.nextLine();

                        switch (suc) {
                            case 1:
                                codigoSuc = "S01";
                                break;
                            case 2:
                                codigoSuc = "S02";
                                break;
                            default:
                                System.out.println("Esta opcion es INVALIDA");
                        }
                    } while (suc < 1 || suc > 2);

                    System.out.print("Ingrese el código de la venta que desea consultar: ");
                    String codigoVentaBuscada = sc.nextLine();

                    Sucursal sucursalVenta2 = empresa.obtenerSucursal(codigoSuc);

                    Venta ventaEncontrada = null;

                    for (Venta v : sucursalVenta2.getListaVentas()) {
                        if (v.getCodigo().equals(codigoVentaBuscada)) {
                            ventaEncontrada = v;
                            break;
                        }
                    }
                    if (ventaEncontrada != null) {
                        System.out.println("Venta encontrada" +
                                "\nCodigo de venta: " + ventaEncontrada.getCodigo() +
                                "\nFecha: " + ventaEncontrada.getFecha());

                        double totalVenta = 0;
                        for (DetalleVenta detalle : ventaEncontrada.getListaDetalles()) { // Asegúrate de tener esta lista en Venta
                            totalVenta += detalle.getSubtotal();
                        }
                        System.out.println("El total a pagar de esta centa es:" + totalVenta);
                    } else {
                        System.out.println("No existe una venta con ese codigo.");
                    }
                    break;


                case 7: {
                    System.out.println("===== CONSULTAR PRENDAS DISPONIBLES =====");

                    System.out.println("1. Sucursal Centro (S01)");
                    System.out.println("2. Sucursal Norte (S02)");
                    System.out.print("Seleccione una sucursal: ");

                    String opcionSucursalConsulta = sc.nextLine();
                    String codigoSucursalConsulta;

                    if (opcionSucursalConsulta.equals("1")) {
                        codigoSucursalConsulta = "S01";
                    } else if (opcionSucursalConsulta.equals("2")) {
                        codigoSucursalConsulta = "S02";
                    } else {
                        System.out.println("Opcion de sucursal no valida.");
                        break;
                    }

                    Sucursal sucursalConsulta =
                            empresa.obtenerSucursal(codigoSucursalConsulta);

                    if (sucursalConsulta != null) {
                        sucursalConsulta.mostrarPrendasDisponibles();
                    } else {
                        System.out.println("No existe una sucursal con ese codigo.");
                    }

                    break;
                }


                case 8: {
                    //cconsultar prendas agotadas
                    System.out.println("\n===== CONSULTAR PRENDAS AGOTADAS =====");
                    System.out.println("1. Sucursal Centro (S01)");
                    System.out.println("2. Sucursal Norte (S02)");
                    System.out.print("Seleccione una sucursal: ");

                    String opcionSucursalConsulta = sc.nextLine();
                    String codigoSucursalConsulta;

                    if (opcionSucursalConsulta.equals("1")) {
                        codigoSucursalConsulta = "S01";
                    } else if (opcionSucursalConsulta.equals("2")) {
                        codigoSucursalConsulta = "S02";
                    } else {
                        System.out.println("Opcion de sucursal no valida.");
                        break;
                    }
                    Sucursal sucursalConsulta =
                            empresa.obtenerSucursal(codigoSucursalConsulta);

                    if (sucursalConsulta != null) {
                        for (Inventario i : sucursalConsulta.getListaInventarios()){
                            if(i.getCantidadDisponible() == 0){
                                String informacionPrenda = i.toString();
                                System.out.println(informacionPrenda);
                            }
                        }
                    } else {
                        System.out.println("No existe una sucursal con ese codigo.");
                    }
                    break;
                }
                case 9:
                    System.out.println("\n===== CONSULTAR VENTAS DE UN VENDEDOR POR SUCURSAL =====");
                    int opciones;
                    String codigoSucursalBuscada = "";
                    do {
                        System.out.println("\nSeleccione la sucursal donde desea buscar:");
                        System.out.println("1. Sucursal código S01");
                        System.out.println("2. Sucursal código S02");
                        System.out.print("Seleccione una opción (1 o 2): ");

                        opciones = sc.nextInt();
                        sc.nextLine();

                        switch (opciones) {
                            case 1:
                                codigoSucursalBuscada = "S01";
                                break;
                            case 2:
                                codigoSucursalBuscada = "S02";
                                break;
                            default:
                                System.out.println("Opción inválida");
                        }
                    } while (opciones < 1 || opciones > 2);


                    Sucursal sucursalElegidaVendedor = empresa.obtenerSucursal(codigoSucursalBuscada);

                    if (sucursalElegidaVendedor != null) {

                        System.out.print("Ingrese el número de documento del vendedor: ");
                        String documentoDelVendedor = sc.nextLine();

                        boolean encontroVentas = false;
                        System.out.println("\n--- Historial de Ventas del Vendedor en " + sucursalElegidaVendedor.getNombre() + " ---");

                        // Recorremos las ventas de la sucursal elegida
                        for (Venta v : sucursalElegidaVendedor.getListaVentas()) {

                            //Verificamos cuales pertenecen al vendedor elegido
                            if (v.getVendedor() != null && v.getVendedor().getDocumento().equalsIgnoreCase(documentoDelVendedor)) {

                                encontroVentas = true;

                                // Calculamos el total de esa venta
                                double totalVenta = 0;
                                if (v.getListaDetalles() != null) {
                                    for (DetalleVenta detalle : v.getListaDetalles()) {
                                        totalVenta += detalle.getSubtotal();
                                    }
                                }

                                // Mostramos el reporte de la venta
                                System.out.println("• Código Venta: " + v.getCodigo() +
                                        " Fecha: " + v.getFecha() +
                                        " Total: $" + totalVenta);
                            }
                        }


                        if (!encontroVentas) {
                            System.out.println("El vendedor con documento '" + documentoDelVendedor +
                                    " no registra ventas en esta sucursal.");
                        }

                    } else {
                        System.out.println("La sucursal seleccionada no existe en la base de datos.");
                    }

                    break;

                case 10: {
                    System.out.println("===== CONSULTAR COMPRAS DE UN CLIENTE =====");

                    System.out.print("Ingrese el documento del cliente: ");
                    String documentoConsulta = sc.nextLine();

                    Cliente clienteSeleccionado = null;

                    for (Cliente clienteRecorrido : empresa.getListaClientes()) {
                        if (clienteRecorrido.getDocumento().equalsIgnoreCase(documentoConsulta)) {
                            clienteSeleccionado = clienteRecorrido;
                            break;
                        }
                    }

                    if (clienteSeleccionado == null) {
                        System.out.println("No existe un cliente con ese documento.");
                        break;
                    }

                    if (clienteSeleccionado.getListaComprasCliente().isEmpty()) {
                        System.out.println("Este cliente no tiene compras registradas.");
                    } else {
                        System.out.println("Compras del cliente:");

                        for (Venta ventaRecorrida : clienteSeleccionado.getListaComprasCliente()) {
                            System.out.println(ventaRecorrida);
                        }
                    }

                    break;
                }
                case 11: {
                    //Calcular Ingresos sucursal

                    System.out.println("===== CALCULAR INGRESOS DE UNA SUCURSAL =====");
                    System.out.println("1. Sucursal Centro (S01)");
                    System.out.println("2. Sucursal Norte (S02)");
                    System.out.print("Seleccione una sucursal: ");

                    String opcionSucursalConsulta = sc.nextLine();
                    String codigoSucursalConsulta;

                    if (opcionSucursalConsulta.equals("1")) {
                        codigoSucursalConsulta = "S01";
                    } else if (opcionSucursalConsulta.equals("2")) {
                        codigoSucursalConsulta = "S02";
                    } else {
                        System.out.println("Opcion de sucursal no valida.");
                        break;
                    }
                    Sucursal sucursalConsulta = empresa.obtenerSucursal(codigoSucursalConsulta);

                    double ingresoTotal = 0;
                    if (sucursalConsulta != null) {
                        for (Inventario i : sucursalConsulta.getListaInventarios()){
                            ingresoTotal += i.getPrenda().getPrecio();
                        }
                        System.out.println("El ingreso total de la sucursal es: $" + ingresoTotal);
                    } else {
                        System.out.println("No existe una sucursal con ese codigo.");
                    }
                    break;
                }
                case 12:
                    System.out.println("\n===== REPORTE: PRENDA MÁS VENDIDA =====");


                    java.util.ArrayList<String> listaReferencias = new java.util.ArrayList<>();
                    java.util.ArrayList<Integer> listaCantidades = new java.util.ArrayList<>();


                    for (Sucursal sucursal : empresa.getListaSucursales()) {


                        for (Venta venta : sucursal.getListaVentas()) {


                            if (venta.getListaDetalles() != null) {
                                for (DetalleVenta detalle : venta.getListaDetalles()) {


                                    Inventario inv = detalle.getInventario();

                                    if (inv != null && inv.getPrenda() != null) {
                                        String referencia = inv.getPrenda().getCodigo();
                                        int cantidadComprada = detalle.getCantidad();


                                        int indice = listaReferencias.indexOf(referencia);

                                        if (indice != -1) {

                                            int cantidadActual = listaCantidades.get(indice);
                                            listaCantidades.set(indice, cantidadActual + cantidadComprada);
                                        } else {

                                            listaReferencias.add(referencia);
                                            listaCantidades.add(cantidadComprada);
                                        }
                                    }
                                }
                            }
                        }
                    }


                    if (!listaCantidades.isEmpty()) {
                        int mayorCantidad = -1;
                        int indiceMayor = -1;

                        for (int i = 0; i < listaCantidades.size(); i++) {
                            if (listaCantidades.get(i) > mayorCantidad) {
                                mayorCantidad = listaCantidades.get(i);
                                indiceMayor = i;
                            }
                        }


                        String referenciaMasVendida = listaReferencias.get(indiceMayor);

                        System.out.println("La prenda más vendida es!");
                        System.out.println("• Referencia / Código: " + referenciaMasVendida);
                        System.out.println("• Unidades totales vendidas: " + mayorCantidad);

                    } else {
                        System.out.println("Aún no hay suficientes registros de ventas para determinar la prenda más vendida.");
                    }
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
