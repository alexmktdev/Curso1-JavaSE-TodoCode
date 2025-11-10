/*
- Ejercicio Integrador1 - Java
- Ejercicio: English School

Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases.
Para ello, decidió la creación de una aplicación que, a partir del ingreso de la edad
del alumno, le informe en qué días y horarios los alumnos tienen clases.

Como información, la academia proporciona los siguientes datos respecto a los grupos
y los diferentes horarios:

- Kinder (de 4 a 6 años inclusive):
  * Lunes y Miércoles de 16:00 a 17:00

- 1st year (de 7 a 8 años inclusive):
  * Martes y Jueves de 16:30 a 17:30

- 2nd year (de 9 a 10 años inclusive):
  * Martes y Jueves de 17:30 a 19:00

- 3rd year (de 11 a 13 años inclusive):
  * Lunes y Miércoles de 17:00 a 18:30

  - Realizar un programa solicitado por el instituto, donde a partir del ingreso
    de la edad del alumno, el sistema informe por pantalla los dias y horarios
    de cursada del alumno en cuestion.
*/


import java.util.Scanner;

public class ejemplo10_integrador1 {
    public static void main(String[] args) {

        System.out.println(" *** Bienvenido a English School ***");
        int edad; // declaramos edad para guardar el dato de entrada

        // activamos la clase Scanner para la entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la edad del alumno a consultar: ");
        edad = teclado.nextInt(); // la entrada edad es integer.

        // hacemos las condiciones
        if(edad >= 4 && edad <= 6){
            System.out.println("** Clases de Kinder ***");
            System.out.println("Dias: Lunes y Miercoles");
            System.out.println("Horario: 16.00 a 17.00 hrs");
        } else if (edad >= 7 && edad <= 8){
            System.out.println("** Clases de 1st Year ***");
            System.out.println("Dias: Martes y Jueves");
            System.out.println("Horario: 16.30 a 17.30 hrs");
        } else if (edad >= 9 && edad <= 10){
            System.out.println("** Clases de 2nd Year ***");
            System.out.println("Dias: Martes y Jueves");
            System.out.println("Horario: 17.30 a 19.00 hrs");
        } else if (edad >= 11 && edad <= 13){
            System.out.println("** Clases de 3rd Year ***");
            System.out.println("Dias: Lunes y Miercoles");
            System.out.println("Horario: 17.00 a 18.30 hrs");
        } else {
            System.out.println("La edad ingresada no es valida, reinicie el programa por favor");
        }

     // cerramos el scanner
        teclado.close();
    }
}
