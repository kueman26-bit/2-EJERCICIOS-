import java.util.Scanner;

public class Break17DeteccionFraude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operaciones = 0;
        double sospechoso = -1;

        while (true) {
            System.out.print("Monto del movimiento (0 para finalizar): S/ ");
            double monto = sc.nextDouble();
            if (monto == 0) break;
            operaciones++;
            // Criterio didactico asumido: montos mayores a S/ 10000 son sospechosos.
            if (monto > 10000) {
                sospechoso = monto;
                break;
            }
        }
        if (sospechoso >= 0) System.out.println("Monto sospechoso: S/ " + sospechoso);
        else System.out.println("No se detecto un movimiento sospechoso.");
        System.out.println("Operaciones revisadas: " + operaciones);
        sc.close();
    }
}
