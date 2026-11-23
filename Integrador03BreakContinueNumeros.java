import java.util.Scanner;

public class Integrador03BreakContinueNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        long suma = 0;

        while (true) {
            System.out.print("Ingrese un entero (999 para terminar): ");
            int numero = sc.nextInt();
            if (numero == 999) break;
            if (numero < 0) continue;

            cantidad++;
            suma += numero;
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Numeros validos: " + cantidad);
        System.out.println("Suma total: " + suma);
        if (cantidad > 0) {
            System.out.printf("Promedio: %.2f%n", (double) suma / cantidad);
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        } else System.out.println("No se ingresaron numeros validos.");
        sc.close();
    }
}
