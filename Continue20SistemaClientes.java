import java.util.Scanner;

public class Continue20SistemaClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de clientes: ");
        int n = sc.nextInt(), validos = 0; sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Cliente " + i);
            System.out.print("Nombre: "); String nombre = sc.nextLine().trim();
            System.out.print("Correo: "); String correo = sc.nextLine().trim();
            System.out.print("Telefono: "); String telefono = sc.nextLine().trim();
            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) continue;
            validos++;
        }
        System.out.println("Clientes validos: " + validos);
        if (n > 0) System.out.printf("Porcentaje de registros validos: %.2f%%%n", 100.0 * validos / n);
        else System.out.println("No se registraron clientes.");
        sc.close();
    }
}
