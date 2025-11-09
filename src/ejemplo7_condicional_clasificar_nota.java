
import java.util.Scanner;

public class ejemplo7_condicional_clasificar_nota {
    public static void main(String[] args) {

        double nota; // declaramos la variable nota para la entrada (double para notas decimales)
        Scanner scanner = new Scanner(System.in); // activamos la Clase Scanner para la entrada

        System.out.print("Ingresa tu nota (1.0 a 7.0): ");
        nota = scanner.nextDouble(); // double para notas decimales

        if (nota >= 6.5) {
            System.out.println("Excelente");
        }else if (nota >= 6.0) {
            System.out.println("Muy Bueno");
        }else if (nota >= 5.0) {
            System.out.println("Bueno");
        }else if (nota >= 4.0) {
            System.out.println("Suficiente");
        }else { // si la nota es menor que 4
            System.out.println("Reprobado");
        }

        scanner.close(); // cerramos la clase scanner
    }
}

/*
Tip importante:

 - En condicionales múltiples como este, el orden sí importa, porque evalúa de arriba hacia abajo.
   Si pusieras if (nota >= 60) primero, nunca llegaría a los casos mayores.

   - una solución para que no importe el orden es ir poniendo condiciones con el rango inferior y el superior, pero
   es más código

   - o con un switch case
 */