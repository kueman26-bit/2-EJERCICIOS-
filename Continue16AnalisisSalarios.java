import java.util.Scanner;

public class Continue16AnalisisSalarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de salarios: ");
        int n = sc.nextInt(), validos = 0;
        double suma = 0, mayor = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Salario " + i + ": S/ ");
            double salario = sc.nextDouble();
            if (salario < 0) continue;
            suma += salario; validos++; mayor = Math.max(mayor, salario);
        }
        if (validos > 0) System.out.printf("Promedio salarial: S/ %.2f%nSalario mas alto: S/ %.2f%n", suma / validos, mayor);
        else System.out.println("No hay salarios validos.");
        sc.close();
    }
}
