import java.util.Scanner;

public class Continue03ControlVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de ventas a ingresar: ");
        int n = sc.nextInt(), validas = 0;
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Venta " + i + ": S/ ");
            double venta = sc.nextDouble();
            if (venta < 0) { System.out.println("Venta negativa ignorada."); continue; }
            total += venta; validas++;
        }
        System.out.printf("Total vendido: S/ %.2f%nVentas validas: %d%n", total, validas);
        sc.close();
    }
}
