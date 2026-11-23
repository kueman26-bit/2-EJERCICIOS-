import java.util.Scanner;

public class Break07RegistroProduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, horas = 0;

        while (true) {
            System.out.print("Produccion de la hora (0 para terminar): ");
            int produccion = sc.nextInt();
            if (produccion == 0) break;
            if (produccion < 0) {
                System.out.println("La produccion no puede ser negativa.");
                continue;
            }
            total += produccion;
            horas++;
        }
        System.out.println("Total producido: " + total);
        System.out.println("Horas registradas: " + horas);
        sc.close();
    }
}
