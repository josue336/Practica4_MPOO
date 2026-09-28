import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Inventario inventario = new Inventario();

        int opcion;

        do {

            System.out.println("\n===== MENU DE INVENTARIO =====");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Buscar producto");
            System.out.println("3. Actualizar existencia");
            System.out.println("4. Calcular valor total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {

                inventario.mostrarInventario();

            } else if (opcion == 2) {

                System.out.print("Ingrese el nombre del producto: ");
                String nombre = entrada.nextLine();

                inventario.buscarProducto(nombre);

            } else if (opcion == 3) {

                System.out.print("Ingrese el nombre del producto: ");
                String nombre = entrada.nextLine();

                System.out.print("Ingrese la nueva existencia: ");
                int existencia = entrada.nextInt();

                inventario.actualizarExistencia(nombre, existencia);

            } else if (opcion == 4) {

                inventario.calcularValorTotal();

            } else if (opcion == 5) {

                System.out.println("Programa terminado.");

            } else {

                System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}
