import java.util.Scanner;

public class DetectorDePosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Ingresa un numero(o ingresa el 0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("saliendo del  programa...");
                break;
            } else if (numero > 0) {
                System.out.println("El número ingresado es positivo.");
            } else {
                System.out.println("El número ingresado es negativo.");
            }
        } while (true);

    }
}
