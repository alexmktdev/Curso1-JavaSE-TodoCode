/*
 - Se piden dos números de entrada con la clase Scanner
 - Se pide por teclado un String operacion (+, - , *, /)
 - se aplican las operaciones en cada caso y se muestra el resultado

*/

import java.util.Scanner;

public class ejemplo9_calculadora_con_switch{
    public static void main(String[] args) {
        // declaramos las variables a utilizar
        double num1, num2, resultado; // doubles para los números de entrada
        char operacion; // variable tipo char para la operacion (opción del switch)

        // se activa la entrada
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        num1 = teclado.nextDouble(); // entrada double (num1)

        System.out.print("Ingresa el segundo número: ");
        num2 = teclado.nextDouble(); // entrada double (num2)

        System.out.print("Elige una operación (+, -, *, /): ");
        operacion = teclado.next().charAt(0);  // entrada char para la operación

        // se evalúan la operación de entrada en el switch case
        switch (operacion) {
            case '+': // si se ingresa un +
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;

            case '-': // si se ingresa un -
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;

            case '*': // si se ingresa un *
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;

            case '/': // si se ingresa un /
                if (num2 != 0) { // 1ro - verificamos que no se haga una division por cero
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else { // si es una división por 0, da error
                    System.out.println("Error: No se puede dividir entre 0");
                }
                break;

            default: // si no se ingresa ninguna de las opciones, da error por default
                System.out.println("La operación ingresada no es válida️");
                break;
        }

        teclado.close(); // Se cierra la entrada de teclado
    }
}
