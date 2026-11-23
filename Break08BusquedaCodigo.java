import java.util.Scanner;

public class Break08BusquedaCodigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] codigos = {"A100", "B205", "C310", "ABC123", "D415", "E520"};
        int revisados = 0, posicion = -1;

        for (int i = 0; i < codigos.length; i++) {
            revisados++;
            if (codigos[i].equals("ABC123")) {
                posicion = i + 1;
                break;
            }
        }
        System.out.println("Codigo buscado: ABC123");
        if (posicion != -1) System.out.println("Posicion encontrada: " + posicion);
        else System.out.println("Codigo no encontrado.");
        System.out.println("Codigos revisados: " + revisados);
        sc.close();
    }
}
