/* ejemplo 1 - condicionales
  - validador de edades
*/

import java.util.Scanner;

public class ejemplo5_condicionales_if {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo para validar la edad de una persona ***");
        // declaramos una variable para la edad
        int edad;
        Scanner teclado = new Scanner(System.in); // activamos el scanner para la entrada

        // pedimos el dato
        System.out.println("Ingrese la edad de la persona: ");
        edad = teclado.nextInt(); //  para ingresar por la entrada un entero (edad)

        // aplicamos la condición
        if (edad >= 18) { // si se cumple la condición, se ejecuta lo que está dentro de las llaves del if
            System.out.println("La persona es mayor de edad ! ");
        } else { // si no se cumple la condición, se ejecuta lo que está dentro de las llaves del else
            System.out.println("La persona es menor de edad ! ");
        }



    }
}
