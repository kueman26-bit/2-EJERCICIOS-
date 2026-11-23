import java.util.Scanner;

public class Break18CompetenciaDeportiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ganador = "";
        int puntajeFinal = 0;

        while (true) {
            System.out.print("Nombre del participante: ");
            String nombre = sc.nextLine().trim();
            System.out.print("Puntaje obtenido: ");
            int puntaje = Integer.parseInt(sc.nextLine().trim());
            if (puntaje >= 100) {
                ganador = nombre;
                puntajeFinal = puntaje;
                break;
            }
            System.out.println("Aun no alcanza los 100 puntos.");
        }
        System.out.println("Ganador: " + ganador);
        System.out.println("Puntaje final: " + puntajeFinal);
        sc.close();
    }
}
