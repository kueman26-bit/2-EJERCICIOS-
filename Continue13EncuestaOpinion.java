import java.util.Scanner;

public class Continue13EncuestaOpinion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] frecuencia = new int[6];
        System.out.print("Cantidad de respuestas: ");
        int n = sc.nextInt(), validas = 0, suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Respuesta " + i + " (1 a 5): ");
            int r = sc.nextInt();
            if (r < 1 || r > 5) continue;
            frecuencia[r]++; validas++; suma += r;
        }
        for (int i = 1; i <= 5; i++) System.out.println("Respuesta " + i + ": " + frecuencia[i]);
        if (validas > 0) System.out.printf("Promedio: %.2f%n", (double) suma / validas);
        else System.out.println("No hay respuestas validas.");
        sc.close();
    }
}
