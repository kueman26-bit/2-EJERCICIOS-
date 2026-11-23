import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Continue10RegistroPagos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Double> registrados = new HashSet<>();
        double total = 0;
        int unicos = 0;
        System.out.print("Cantidad de pagos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Pago " + i + ": S/ ");
            double pago = sc.nextDouble();
            if (registrados.contains(pago)) continue;
            registrados.add(pago); total += pago; unicos++;
        }
        System.out.printf("Total acumulado (pagos unicos): S/ %.2f%nCantidad de pagos unicos: %d%n", total, unicos);
        sc.close();
    }
}
