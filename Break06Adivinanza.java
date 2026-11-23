import java.util.Random;
import java.util.Scanner;

public class Break06Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = new Random().nextInt(100) + 1;
        int intentos = 0;

        while (true) {
            System.out.print("Adivine el numero (1 a 100): ");
            int numero = sc.nextInt();
            intentos++;
            if (numero == secreto) break;
            if (numero < secreto) System.out.println("El numero secreto es mayor.");
            else System.out.println("El numero secreto es menor.");
        }
        System.out.println("Felicitaciones. Adivinaste en " + intentos + " intento(s).");
        sc.close();
    }
}
