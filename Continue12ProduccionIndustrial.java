import java.util.Scanner;

public class Continue12ProduccionIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de dias: ");
        int n = sc.nextInt(), diasValidos = 0, total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Produccion del dia " + i + ": ");
            int p = sc.nextInt();
            if (p == 0) continue;
            if (p < 0) continue;
            total += p; diasValidos++;
        }
        System.out.println("Produccion acumulada: " + total);
        if (diasValidos > 0) System.out.printf("Promedio diario: %.2f%n", (double) total / diasValidos);
        else System.out.println("No hay dias con produccion valida.");
        sc.close();
    }
}
