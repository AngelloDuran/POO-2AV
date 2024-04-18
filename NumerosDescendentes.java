import java.util.Scanner;

public class NumerosDescendentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        System.out.println("Ingrese 3 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números en orden descendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Imprimir los números en orden descendente
        System.out.println("Números en orden descendente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}