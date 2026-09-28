
public class Inventario {

    String[] nombres = {"Laptop", "Mouse", "Teclado", "Monitor", "Audifonos"};
    double[] precios = {15000.00, 350.50, 850.00, 4200.00, 1200.00};
    int[] existencias = {5, 15, 10, 7, 20};

    public void buscarProducto(String nombre) {

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(nombre)) {

                System.out.println("Producto encontrado:");
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Precio: $" + precios[i]);
                System.out.println("Existencia: " + existencias[i]);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no se encuentra en el inventario.");
        }
    }

    public void actualizarExistencia(String nombre, int nuevaExistencia) {

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(nombre)) {

                existencias[i] = nuevaExistencia;

                System.out.println("Existencia actualizada correctamente.");
                System.out.println("Producto: " + nombres[i]);
                System.out.println("Nueva existencia: " + existencias[i]);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no se encuentra en el inventario.");
        }
    }

    public void calcularValorTotal() {

        double total = 0;

        for (int i = 0; i < nombres.length; i++) {
            total = total + (precios[i] * existencias[i]);
        }

        System.out.println("Valor total del inventario: $" + total);
    }

    public void mostrarInventario() {

        System.out.println("\n--- INVENTARIO ---");

        for (int i = 0; i < nombres.length; i++) {

            System.out.println(
                (i + 1) + ". " + nombres[i]
                + " | Precio: $" + precios[i]
                + " | Existencia: " + existencias[i]
            );
        }
    }
}
