import java.util.Scanner;

public class Break03TemperaturaIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lecturas = 0;
        double temperaturaCritica = 0;

        while (true) {
            System.out.print("Temperatura de la maquina (-999 para finalizar): ");
            double temperatura = sc.nextDouble();
            if (temperatura == -999) break;
            lecturas++;
            if (temperatura > 95) {
                temperaturaCritica = temperatura;
                break;
            }
        }

        System.out.println("Lecturas realizadas: " + lecturas);
        if (temperaturaCritica > 95) System.out.println("Temperatura critica encontrada: " + temperaturaCritica + " C");
        else System.out.println("No se detecto temperatura critica.");
        sc.close();
    }
}
