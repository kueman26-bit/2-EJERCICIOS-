import java.util.Scanner;

public class Break11MonitoreoServidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int procesados = 0, tiempoCritico = -1;

        while (true) {
            System.out.print("Tiempo de respuesta en ms (-1 para finalizar): ");
            int tiempo = sc.nextInt();
            if (tiempo == -1) break;
            procesados++;
            if (tiempo > 5000) {
                tiempoCritico = tiempo;
                break;
            }
        }
        if (tiempoCritico != -1) System.out.println("Tiempo critico: " + tiempoCritico + " ms");
        else System.out.println("No se encontro un tiempo critico.");
        System.out.println("Registros procesados: " + procesados);
        sc.close();
    }
}
