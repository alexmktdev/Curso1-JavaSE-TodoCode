/*
 este ejemplo es un generador de emails
 de acuerdo a los datos de entrada
*/

/* se pide ingresar:
   - nombre
   - apellido
   - año de nacimineto abreviado ej: 20 (2020) 94 (1994)
   y se debe generar en la salida un email como: alexanderruiz20@gmail.com
 */

import java.util.Scanner;

public class ejemplo4_operadores2 {
    public static void main(String[] args) {
        System.out.println("*** Sistema de generacion de Emails ***");

        // declaración de datos de entrada
        String nombre, apellido, extension_empresa, email_final;
        int anio_nac;
        extension_empresa = "@gmail.com";

        // declaramos un Scanner para pedir los datos por la entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine(); // para ingresar por la entrada un String

        System.out.println("Ingrese el apellido del empleado: ");
        apellido = teclado.nextLine();

        System.out.println("Ingrese el año de nacimiento abreviado (ej: 1994 -> 94) del empleado:");
        anio_nac = teclado.nextInt(); // para ingresar por la entrada un entero

        // operación para generar el email (concatenamos los Strings)
        email_final = nombre + apellido + anio_nac + extension_empresa;
        System.out.println("El email generado para el empleado es: " + email_final);

        teclado.close(); // cerramos la entrada
    }
}
