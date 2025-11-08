import java.util.Scanner;

// ejercicio de calculadora en java
/*
- ejemplo incluye:
    - entradas Scanner
    - mensajes por terminal
    - operadores
    - variables
 */

public class ejemplo3_operadores {
    public static void main(String[] args) {
        double num1, num2, suma = 0,resta = 0,multiplicacion = 0 ,division = 0;

        // para leer por teclado usamos la clase scanner
        Scanner teclado = new Scanner(System.in); // entrada de teclado
        System.out.println("Ingrese el primer numero para sumar: ");
        num1 = teclado.nextDouble(); // entrada entero num1
        System.out.println("Ingrese el segundo numero para sumar:");
        num2 = teclado.nextDouble(); // entrada entero num2

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1/num2;
        System.out.println("La suma es:  " + suma);
        System.out.println("La resta es:  " + resta);
        System.out.println("La multiplicacion es:  " + multiplicacion);
        System.out.println("La Division es: " + division);
        
    }

}
