import java.util.Scanner;

public class Break15VerificacionInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validos = 0;
        String productoError = "";

        while (true) {
            System.out.print("Nombre del producto (FIN para terminar): ");
            String producto = sc.nextLine().trim();
            if (producto.equalsIgnoreCase("FIN")) break;
            System.out.print("Stock: ");
            int stock = Integer.parseInt(sc.nextLine().trim());
            if (stock < 0) {
                productoError = producto;
                break;
            }
            validos++;
        }
        if (!productoError.isEmpty()) System.out.println("Producto con error: " + productoError);
        else System.out.println("No se detecto stock negativo.");
        System.out.println("Registros validos: " + validos);
        sc.close();
    }
}
