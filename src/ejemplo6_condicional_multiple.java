// ejemplo de condicionales multiples

import java.util.Scanner;

/* validamos la edad de una persona con los siguientes casos:
   - mayor de 18 años - mensaje correspondiente
   - menor de 18 años - mensaje correspondiente
   - igual a 18 años - mensaje correspondiente
   - edad menor que 0 - mensaje correspondiente
 */
public class ejemplo6_condicional_multiple {
    public static void main(String[] args) {
        // creamos una variable para la edad
        int edad;
        // activamos la entrada de datos con la clase Scanner
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        edad = teclado.nextInt(); // entrada entero

        // validamos la edad
        if (edad > 18){
            System.out.println("La persona es mayor de edad , tiene más de 18 años !");
        }else if(edad == 18){
                System.out.println("La persona tiene 18 años exactos !");
        }else { // el >= 0 incluye a un bebe de meses
            System.out.println("La persona tiene menos de 18 años");
        }
    }
}

