import java.util.ArrayList;
import java.util.Scanner;

public class Continue07RegistroCorreos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> validos = new ArrayList<>();
        System.out.print("Cantidad de correos: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Correo " + i + ": ");
            String correo = sc.nextLine().trim();
            if (!correo.contains("@")) continue;
            validos.add(correo);
        }
        System.out.println("Correos validos:");
        for (String correo : validos) System.out.println("- " + correo);
        sc.close();
    }
}
