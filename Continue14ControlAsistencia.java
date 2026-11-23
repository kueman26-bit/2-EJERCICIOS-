import java.util.Scanner;

public class Continue14ControlAsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt(), asistentes = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Estado del estudiante " + i + " (P=presente, A=ausente, R=retirado): ");
            String estado = sc.next();
            if (estado.equalsIgnoreCase("R")) continue;
            if (estado.equalsIgnoreCase("P")) asistentes++;
        }
        System.out.println("Cantidad de asistentes validos: " + asistentes);
        sc.close();
    }
}
