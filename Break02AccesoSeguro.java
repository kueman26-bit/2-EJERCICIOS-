import java.util.Scanner;

public class Break02AccesoSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CLAVE = "Java2026";
        boolean acceso = false;
        int intentoAcceso = 0;

        for (int intento = 1; intento <= 5; intento++) {
            System.out.print("Ingrese la contrasena (intento " + intento + "/5): ");
            String clave = sc.nextLine();
            if (clave.equals(CLAVE)) {
                acceso = true;
                intentoAcceso = intento;
                break;
            }
            System.out.println("Contrasena incorrecta.");
        }

        if (acceso) System.out.println("Acceso concedido en el intento " + intentoAcceso + ".");
        else System.out.println("Acceso denegado. Se agotaron los 5 intentos.");
        sc.close();
    }
}
