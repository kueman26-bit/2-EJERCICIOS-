import java.util.Scanner;

public class Break13VentaEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, ventas = 0;

        while (total < 500) {
            System.out.print("Cantidad de entradas vendidas en esta operacion: ");
            int cantidad = sc.nextInt();
            if (cantidad <= 0) {
                System.out.println("Ingrese una cantidad positiva.");
                continue;
            }
            total += cantidad;
            ventas++;
        }
        System.out.println("Meta alcanzada.");
        System.out.println("Total vendido: " + total);
        System.out.println("Numero de ventas realizadas: " + ventas);
        sc.close();
    }
}
