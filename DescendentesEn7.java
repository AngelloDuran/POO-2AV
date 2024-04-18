public class DescendentesEn7 {
    public static void main(String[] args) {
        int contador = 100;

        do {
            System.out.println(contador);
            contador -= 7;

            if (contador <= 0) {
                System.out.println("Saliendo del programa...");
                break;
            }
        } while (true);
    }
}
