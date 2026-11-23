import java.util.Scanner;

public class Continue11SistemaInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de productos: ");
        int n = sc.nextInt(), disponibles = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Stock del producto " + i + ": ");
            int stock = sc.nextInt();
            if (stock == 0) continue;
            if (stock > 0) disponibles++;
        }
        System.out.println("Productos disponibles: " + disponibles);
        sc.close();
    }
}
