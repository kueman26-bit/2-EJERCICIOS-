import java.util.Scanner;

public class Break04NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int divisor = 0;

        if (numero > 1) {
            for (int i = 2; i <= numero / i; i++) {
                if (numero % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }

        if (numero > 1 && divisor == 0) System.out.println(numero + " es primo.");
        else {
            System.out.println(numero + " no es primo.");
            if (divisor != 0) System.out.println("Primer divisor encontrado: " + divisor);
            else System.out.println("No existe divisor primo que comprobar para este numero.");
        }
        sc.close();
    }
}
