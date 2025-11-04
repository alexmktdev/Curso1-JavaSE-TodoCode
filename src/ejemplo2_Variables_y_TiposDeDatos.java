
public class ejemplo2_Variables_y_TiposDeDatos {
    public static void main(String[] args) {

        // declaración de variables
        int edad; // declaramos tipo entero
        double estatura; // declaramos tipo double
        boolean tieneCarnet; // declaramos tipo boolean
        char letra; // declaramos tipo char
        String direccion; // tipo string
        long numeroLargo; // tipo Long (largo)

        // asignación de variables
        edad = 18;
        estatura = 1.80;
        tieneCarnet = true;
        letra = 'a';
        direccion = "Avenida Oriente 2135";
        numeroLargo = 12345678910L; // se usa una L de larga al final

        // usemos las variables
        System.out.println("Mi edad es " + edad);
        System.out.println("la edad es " + edad + " y la estatura: " + estatura);
        System.out.println("Mi direccion es: " +direccion);
    }
}
