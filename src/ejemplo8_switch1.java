// ejemplo switch case

// la condición debe ser simple


import java.util.Scanner;

public class ejemplo8_switch1 {
    public static void main(String[] args) {

        // declaración de variables
        int dia;
        String nombre_dia;

        // activamos el scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una opcion del 1 al 7 (dias de la semana): ");
        dia = teclado.nextInt(); // entrada entero (dia de la semana)

        // hacemos el switch
        switch (dia){
            case 1: nombre_dia = "Lunes"; // si se ingresa por la entrada 1
                    break;
            case 2: nombre_dia = "Martes"; // si se ingresa por la entrada 2
                    break;
            case 3: nombre_dia = "Miercoles"; // si se ingresa por la entrada 3
                    break;
            case 4: nombre_dia = "Jueves"; // si se ingresa por la entrada 4
                    break;
            case 5: nombre_dia = "Viernes"; // si se ingresa por la entrada 5
                    break;
            case 6: nombre_dia = "Sabado"; // si se ingresa por la entrada 6
                    break;
            case 7: nombre_dia = "Domingo"; // si se ingresa por la entrada 7
                    break;
            default: nombre_dia = "Dia Incorrecto !";
        }
        System.out.println("El dia ingresado fue: " + nombre_dia);

        teclado.close(); // cerramos la entrada Scanner teclado
    }
}
