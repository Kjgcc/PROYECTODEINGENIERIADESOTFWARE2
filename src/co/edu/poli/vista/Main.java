package co.edu.poli.vista;

import co.edu.poli.controlador.ClienteDAO;
import co.edu.poli.controlador.ProductoDAO;
import co.edu.poli.modelo.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDAO clienteDAO = ClienteDAO.getInstancia();
        ProductoDAO productoDAO = new ProductoDAO();

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Administrar Clientes");
            System.out.println("2. Administrar Productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    administrarClientes(scanner, clienteDAO);
                    break;
                case 2:
                    administrarProductos(scanner, productoDAO);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }

    private static void administrarClientes(Scanner scanner, ClienteDAO clienteDAO) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE CLIENTES ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombre = scanner.nextLine();
                    Cliente nuevoCliente = new Cliente(clienteDAO.obtenerClientes().size() + 1, nombre);
                    clienteDAO.agregarCliente(nuevoCliente);
                    System.out.println("Cliente agregado correctamente.");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes:");
                    for (Cliente c : clienteDAO.obtenerClientes()) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID del cliente a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (clienteDAO.eliminarCliente(idEliminar)) {
                        System.out.println("Cliente eliminado correctamente.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private static void administrarProductos(Scanner scanner, ProductoDAO productoDAO) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE PRODUCTOS ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de producto:");
                    System.out.println("1. Electrónico");
                    System.out.println("2. Alimento");
                    int tipoProducto = scanner.nextInt();

                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();

                    if (tipoProducto == 1) {
                        System.out.print("Ingrese el voltaje de entrada: ");
                        int voltaje = scanner.nextInt();
                        productoDAO.agregarProducto(new Electronico(productoDAO.obtenerProductos().size() + 1, nombre, precio, voltaje));
                    } else if (tipoProducto == 2) {
                        System.out.print("Ingrese el aporte calórico: ");
                        int calorias = scanner.nextInt();
                        productoDAO.agregarProducto(new Alimento(productoDAO.obtenerProductos().size() + 1, nombre, precio, calorias));
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.println("\nLista de Productos:");
                    for (Producto p : productoDAO.obtenerProductos()) {
                        System.out.println(p.obtenerInfo());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Producto producto = productoDAO.buscarProducto(idBuscar);
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto.obtenerInfo());
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
