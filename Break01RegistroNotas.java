import java.util.Scanner;

public class Break01RegistroNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0, nota, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese una nota (20 para finalizar): ");
            nota = sc.nextDouble();
            if (nota == 20) break;
            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera del rango. No se registra.");
                continue;
            }
            cantidad++;
            suma += nota;
            max = Math.max(max, nota);
            min = Math.min(min, nota);
        }

        System.out.println("\n--- ESTADISTICAS ---");
        System.out.println("Notas registradas: " + cantidad);
        if (cantidad > 0) {
            System.out.printf("Promedio: %.2f%nNota maxima: %.2f%nNota minima: %.2f%n", suma / cantidad, max, min);
        } else System.out.println("No se registraron notas.");
        sc.close();
    }
}
