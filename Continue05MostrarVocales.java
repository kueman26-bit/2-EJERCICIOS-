import java.util.Scanner;

public class Continue05MostrarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine().toLowerCase();
        StringBuilder vocales = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("aeiouáéíóú".indexOf(c) == -1) continue;
            vocales.append(c).append(' ');
        }
        System.out.println("Vocales encontradas: " + vocales);
        sc.close();
    }
}
