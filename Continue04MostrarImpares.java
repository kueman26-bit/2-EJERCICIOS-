public class Continue04MostrarImpares {
    public static void main(String[] args) {
        System.out.println("Numeros impares del 1 al 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
