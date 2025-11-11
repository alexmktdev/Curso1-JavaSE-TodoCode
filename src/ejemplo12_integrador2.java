
/*
Ejercicio: Mercería

Una mercería vende canutillos y mostacillas al por mayor mediante su página web.
Como se trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta
y dependiendo de esta realiza los siguientes controles:

- Si la cantidad de productos es menor a 5:
  Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.

- Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15:
  Se debe emitir un mensaje que el costo de envío es de $10 USD.

- Si la cantidad de productos es mayor a 15:
  Se debe emitir un mensaje de que el envío es gratuito.

Realizar el programa necesario para llevar a cabo los 3 controles citados.

 Punto extra**
*/

import java.util.Scanner;

public class ejemplo12_integrador2 {
    public static void main(String[] args) {
        // declaramos variable
        int cantPaquetes;
        // activamos la entrada Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes:");
        cantPaquetes = teclado.nextInt(); // entrada de enteros

        if(cantPaquetes > 0 && cantPaquetes < 5){
            System.out.println("No se permiten compras inferiores a 5 paquetes");
        } else if (cantPaquetes >= 5 && cantPaquetes <= 15){
            System.out.println("El costo de envio del paquete es de 10 USD");
        } else if (cantPaquetes > 15){
            System.out.println("El costo del envio del paquete es gratuito");
        } else {
            System.out.println("La cantidad de paquetes ingresada no es vàlida, reinicie el programa");
        }


        // cerramos la entrada Scanner
        teclado.close();
    }
}
