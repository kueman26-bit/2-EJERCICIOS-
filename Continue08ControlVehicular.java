import java.util.Scanner;

public class Continue08ControlVehicular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de vehiculos: ");
        int n = sc.nextInt(), validas = 0;
        double suma = 0, mayor = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Velocidad " + i + " (km/h): ");
            double v = sc.nextDouble();
            if (v < 20) continue;
            suma += v; validas++; mayor = Math.max(mayor, v);
        }
        if (validas > 0) System.out.printf("Velocidad promedio: %.2f km/h%nMayor velocidad: %.2f km/h%n", suma / validas, mayor);
        else System.out.println("No hay velocidades validas.");
        sc.close();
    }
}
