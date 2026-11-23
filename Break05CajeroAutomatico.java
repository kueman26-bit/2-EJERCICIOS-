import java.util.Scanner;

public class Break05CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int operaciones = 0;

        while (true) {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo\n2. Depositar\n3. Retirar\n4. Salir");
            System.out.print("Seleccione: ");
            int opcion = sc.nextInt();

            if (opcion == 4) break;
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: S/ %.2f%n", saldo);
                    operaciones++;
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) { saldo += deposito; operaciones++; }
                    else System.out.println("Monto no valido.");
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) { saldo -= retiro; operaciones++; }
                    else System.out.println("Monto no valido o saldo insuficiente.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        System.out.println("Operaciones realizadas: " + operaciones);
        System.out.println("Sesion cerrada. Gracias por usar el cajero.");
        sc.close();
    }
}
