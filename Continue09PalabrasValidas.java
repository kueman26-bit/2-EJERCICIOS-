import java.util.Scanner;

public class Continue09PalabrasValidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de palabras: ");
        int n = sc.nextInt(), validas = 0; sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Palabra " + i + ": ");
            String palabra = sc.nextLine().trim();
            if (palabra.length() < 5) continue;
            validas++;
        }
        System.out.println("Cantidad de palabras validas: " + validas);
        sc.close();
    }
}
