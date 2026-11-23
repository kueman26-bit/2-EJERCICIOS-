import java.util.Scanner;

public class Break20SimulacionRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validos = 0, paqueteCorrupto = -1, numeroPaquete = 0;

        while (true) {
            System.out.print("Estado del paquete " + (numeroPaquete + 1) + " (V=valido, C=corrupto, F=fin): ");
            String estado = sc.next().trim();
            if (estado.equalsIgnoreCase("F")) break;
            numeroPaquete++;
            if (estado.equalsIgnoreCase("C")) {
                paqueteCorrupto = numeroPaquete;
                break;
            } else if (estado.equalsIgnoreCase("V")) validos++;
            else System.out.println("Estado no reconocido; vuelva a ingresarlo.");
        }
        if (paqueteCorrupto != -1) System.out.println("Numero del paquete corrupto: " + paqueteCorrupto);
        else System.out.println("No se detecto paquete corrupto.");
        System.out.println("Paquetes validos procesados: " + validos);
        sc.close();
    }
}
