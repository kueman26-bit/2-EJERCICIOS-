import java.util.Scanner;

public class Continue02RegistroEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de personas a registrar: ");
        int n = sc.nextInt(), validas = 0, suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Edad " + i + ": ");
            int edad = sc.nextInt();
            if (edad < 18 || edad > 65) continue;
            validas++; suma += edad;
        }
        System.out.println("Personas validas: " + validas);
        if (validas > 0) System.out.printf("Promedio de edad: %.2f%n", (double) suma / validas);
        else System.out.println("No hay edades validas.");
        sc.close();
    }
}
