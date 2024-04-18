import java.util.Scanner;

public class NotasNumericas {
    public static void main(String[] args) {
        Scanner bucle = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Ingrese un numero 0-10,(O ingrese el 0 para salir)");
            nota = bucle.nextInt();

            if (nota == 0) {
                System.out.println("saliendo del programa...");
                break;
            }

            if (nota < 0 || nota > 100) {
                System.out.println("nota invalida por favor ingrese otro numero del 0-10");
                continue;
            }

            String notaEnPalabras = convertirNotaEnPalabras(nota);
            System.out.println("la nota ingresada es:" + notaEnPalabras);
        } while (true);
    }

    public static String convertirNotaEnPalabras(int nota) {
        String[] palabras = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
                "diez" };
        return palabras[nota];
    }

}
