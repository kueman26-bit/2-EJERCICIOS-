import java.util.Scanner;

public class Integrador01BreakNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validas = 0, aprobados = 0, desaprobados = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= 200; i++) {
            System.out.print("Nota " + i + "/200 (20 para finalizar): ");
            double nota = sc.nextDouble();
            if (nota == 20) break;
            if (nota < 0 || nota > 20) continue;
            validas++; suma += nota;
            max = Math.max(max, nota); min = Math.min(min, nota);
            if (nota >= 11) aprobados++; else desaprobados++;
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Notas validas: " + validas);
        if (validas > 0) {
            System.out.printf("Promedio: %.2f%nNota maxima: %.2f%nNota minima: %.2f%n", suma / validas, max, min);
        } else System.out.println("No se registraron notas validas.");
        System.out.println("Aprobados (11 a 20): " + aprobados);
        System.out.println("Desaprobados (0 a 10): " + desaprobados);
        sc.close();
    }
}
