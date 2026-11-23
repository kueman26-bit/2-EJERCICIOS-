import java.util.Scanner;

public class Break16ControlCalidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int revisadas = 0;
        double incorrecta = Double.NaN;
        final double MIN = 9.5, MAX = 10.5;

        while (true) {
            System.out.print("Medida de la pieza (-999 para terminar): ");
            double medida = sc.nextDouble();
            if (medida == -999) break;
            revisadas++;
            if (medida < MIN || medida > MAX) {
                incorrecta = medida;
                break;
            }
        }
        if (!Double.isNaN(incorrecta)) System.out.println("Medida incorrecta: " + incorrecta);
        else System.out.println("No se encontraron medidas fuera del rango.");
        System.out.println("Piezas revisadas: " + revisadas);
        System.out.println("Rango permitido asumido: " + MIN + " a " + MAX);
        sc.close();
    }
}
