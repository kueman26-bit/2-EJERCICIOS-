import java.util.Scanner;

public class Break09EncuestaOpinion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0, suma = 0;

        while (true) {
            System.out.print("Califique del 1 al 5 (0 para finalizar): ");
            int respuesta = sc.nextInt();
            if (respuesta == 0) break;
            if (respuesta < 1 || respuesta > 5) {
                System.out.println("Respuesta invalida.");
                continue;
            }
            cantidad++;
            suma += respuesta;
        }
        System.out.println("Total de respuestas: " + cantidad);
        if (cantidad > 0) System.out.printf("Promedio de satisfaccion: %.2f%n", (double) suma / cantidad);
        else System.out.println("No hay respuestas para calcular el promedio.");
        sc.close();
    }
}
