
/*
 Operadores ternarios en java

 ejemplo: Programa que dependiendo del promedio de un alumno
          nos diga si aprobo o no una materia.
*/

import java.util.Scanner;

public class ejemplo11_operador_ternario1 {
    public static void main(String[] args) {

        /* como necesitamos saber si una persona aprobo o no
           son dos opciones de salida sencilla, para estos casos
           sirve el operador ternario
         */

        // declaracion de variable
        double promedio; // valor de entrada
        String condicionFinal; // para guardar resultado (Si aprobo o no)

        // activamos la Clase Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el promedio del alumno que quiere consultar: ");
        promedio = teclado.nextDouble(); // entrada tipo double

        // operador ternario ( se usa en casos sencillos con dos opciones, pero se pueden anidar)
        condicionFinal = promedio >= 4.0 ? "Alumno Aprobado" : "Alumno Reprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal + " su promedio fue: " + promedio ); // imprimimos la respuesta posible
    }
}

/*
    Sintaxis Operador Ternario

    salida_operador_ternario = condicion ? resultado si se cumple la condicion : resultado si no se cumple la condicion;
 */