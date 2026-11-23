import java.util.Scanner;

public class Continue15EvaluacionExamenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de preguntas: ");
        int n = sc.nextInt(), validas = 0, aciertos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Respuesta " + i + " (1=acierto, 0=error, -1=sin responder): ");
            int r = sc.nextInt();
            if (r == -1) continue;
            if (r != 0 && r != 1) continue;
            validas++;
            if (r == 1) aciertos++;
        }
        System.out.println("Respuestas validas: " + validas);
        if (validas > 0) System.out.printf("Porcentaje de aciertos: %.2f%%%n", 100.0 * aciertos / validas);
        else System.out.println("No hay respuestas validas.");
        sc.close();
    }
}
