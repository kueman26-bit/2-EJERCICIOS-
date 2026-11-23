public class Continue19AnalisisNumeros {
    public static void main(String[] args) {
        int cantidad = 0;
        System.out.println("Numeros del 1 al 500 que no son multiplos de 2, 3 ni 5:");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue;
            System.out.print(i + " ");
            cantidad++;
        }
        System.out.println("\nCantidad encontrada: " + cantidad);
    }
}
