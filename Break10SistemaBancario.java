import java.util.Scanner;

public class Break10SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int procesados = 0;
        double sospechosa = 0;

        while (true) {
            System.out.print("Monto de transferencia (0 para finalizar): S/ ");
            double monto = sc.nextDouble();
            if (monto == 0) break;
            procesados++;
            if (monto > 100000) {
                sospechosa = monto;
                break;
            }
        }
        if (sospechosa > 100000) System.out.println("Transferencia detectada: S/ " + sospechosa);
        else System.out.println("No se detectaron transferencias superiores a S/ 100000.");
        System.out.println("Registros procesados: " + procesados);
        sc.close();
    }
}
