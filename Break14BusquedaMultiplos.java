public class Break14BusquedaMultiplos {
    public static void main(String[] args) {
        for (int numero = 1; ; numero++) {
            if (numero % 17 == 0 && numero % 23 == 0) {
                System.out.println("Primer numero divisible entre 17 y 23: " + numero);
                break;
            }
        }
    }
}
