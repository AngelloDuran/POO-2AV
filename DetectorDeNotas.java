import java.util.Scanner;

public class DetectorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int calificacion;

        do {
            System.out.println("Ingrese su calificacion (o ingrese 0 para salir):");
            calificacion = scanner.nextInt();

            if (calificacion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            String resultado = obtenerResultado(calificacion);
            System.out.println("Su calificacion es: " + resultado);
        } while (true);
    }

    public static String obtenerResultado(int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            return "Calificacion invalida";
        } else if (calificacion < 50) {
            return "Insuficiente";
        } else if (calificacion < 70) {
            return "Suficiente";
        } else if (calificacion < 80) {
            return "Bien";
        } else {
            return "Excelente";
        }
    }
}