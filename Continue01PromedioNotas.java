import java.util.Scanner;

public class Continue01PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        int validas = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Nota " + i + "/100: ");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 20) {
                System.out.println("Nota invalida; se ignora.");
                continue;
            }
            suma += nota; validas++;
            max = Math.max(max, nota); min = Math.min(min, nota);
        }
        if (validas > 0) {
            System.out.printf("Promedio: %.2f%nNota maxima: %.2f%nNota minima: %.2f%n", suma / validas, max, min);
        } else System.out.println("No se ingresaron notas validas.");
        sc.close();
    }
}
