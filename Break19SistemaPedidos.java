import java.util.Scanner;

public class Break19SistemaPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int procesados = 0, urgente = -1;

        while (true) {
            System.out.print("Numero de pedido (0 para finalizar): ");
            int numero = sc.nextInt();
            if (numero == 0) break;
            System.out.print("Es urgente? (S/N): ");
            String respuesta = sc.next();
            procesados++;
            if (respuesta.equalsIgnoreCase("S")) {
                urgente = numero;
                break;
            }
        }
        if (urgente != -1) System.out.println("Pedido urgente: " + urgente);
        else System.out.println("No se encontro un pedido urgente.");
        System.out.println("Pedidos procesados: " + procesados);
        sc.close();
    }
}
