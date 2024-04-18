import java.util.Scanner;
import java.util.Scanner;

public class NumerosCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número (o ingrese 0 para salir)");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido. Por favor, ingrese un número positivo.");
                continue;
            }

            if (numero == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        } while (true);
    }
}
