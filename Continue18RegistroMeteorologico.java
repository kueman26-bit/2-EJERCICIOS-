import java.util.Scanner;

public class Continue18RegistroMeteorologico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de registros de lluvia: ");
        int n = sc.nextInt(), validos = 0;
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Precipitacion " + i + " (mm): ");
            double lluvia = sc.nextDouble();
            if (lluvia < 0) continue;
            total += lluvia; validos++;
        }
        System.out.printf("Precipitacion acumulada: %.2f mm%n", total);
        if (validos > 0) System.out.printf("Promedio: %.2f mm%n", total / validos);
        else System.out.println("No hay registros validos para calcular el promedio.");
        sc.close();
    }
}
