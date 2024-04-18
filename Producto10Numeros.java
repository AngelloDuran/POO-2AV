import java.util.Scanner;

public class Producto10Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producto = 1;
        int contador = 0;
        int numero = 1;

        do {
            producto *= numero;
            contador++;
            numero += 2; // Siguiente número impar

            if (contador == 10 || producto == 0) {
                break;
            }
        } while (true);

        System.out.println("El producto de los 10 primeros números impares es: " + producto);

    }
}
