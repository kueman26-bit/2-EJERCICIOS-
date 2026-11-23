import java.util.Scanner;

public class Integrador02ContinueNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validas = 0, invalidas = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Nota " + i + "/200: ");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 20) {
                invalidas++;
                continue;
            }
            validas++; suma += nota;
            max = Math.max(max, nota); min = Math.min(min, nota);
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Notas validas: " + validas);
        System.out.println("Notas invalidas: " + invalidas);
        if (validas > 0) {
            System.out.printf("Promedio: %.2f%nNota maxima: %.2f%nNota minima: %.2f%n", suma / validas, max, min);
        } else System.out.println("No hay notas validas para calcular estadisticas.");
        sc.close();
    }
}
