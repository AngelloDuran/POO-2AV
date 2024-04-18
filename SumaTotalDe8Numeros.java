import java.util.Scanner;

public class SumaTotalDe8Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un número (o ingrese 0 para salir): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            suma += numero;
            contador++;

            if (contador == 8) {
                break;
            }
        } while (true);

        System.out.println("La suma total de los números ingresados es: " + suma);
    }
}
