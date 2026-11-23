import java.util.Scanner;

public class Continue17ProcesamientoTransacciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de transacciones: ");
        int n = sc.nextInt(), validas = 0;
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Monto " + i + ": S/ ");
            double monto = sc.nextDouble();
            if (monto < 10) continue;
            total += monto; validas++;
        }
        System.out.printf("Total procesado: S/ %.2f%nTransacciones validas: %d%n", total, validas);
        sc.close();
    }
}
