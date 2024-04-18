import java.util.Scanner;
import java.util.Arrays;

public class Orden3Numeros {
    public static void main(String[] args) {
        Scanner Orden = new Scanner(System.in);
        int[] numeros = new int[3];
        int i = 0;
        do {
            System.out.println("Ingrese 3 numeros, (o ingrense 0 para salir)");
            numeros[i] = Orden.nextInt();
            if (numeros[i] == 0) {
                System.out.println("Saliendo del programa...");
                return;
            }
            i++;
        } while (i < 3);

        Arrays.sort(numeros);
        System.out.println("Resultado:" + Arrays.toString(numeros));
    }
}