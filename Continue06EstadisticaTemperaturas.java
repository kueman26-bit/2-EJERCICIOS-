import java.util.Scanner;

public class Continue06EstadisticaTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de temperaturas: ");
        int n = sc.nextInt(), validas = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Temperatura " + i + ": ");
            double t = sc.nextDouble();
            if (t < -10 || t > 50) continue;
            suma += t; validas++; max = Math.max(max, t); min = Math.min(min, t);
        }
        if (validas > 0) System.out.printf("Promedio: %.2f C%nMaxima: %.2f C%nMinima: %.2f C%n", suma / validas, max, min);
        else System.out.println("No hay temperaturas validas.");
        sc.close();
    }
}
