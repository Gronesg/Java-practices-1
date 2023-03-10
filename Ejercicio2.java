import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla. 
*/

public class Ejercicio2{

    public static void main (String[] args) {
        System.out.println("////////////////////");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.next();                     //A diferencia del nextin, aqui al ingresar un string se utiliza "next()" o "nextline()"
        System.out.println("Bienvenido " + nombre.toUpperCase());    //toUpperCase pone todo en mayusculas
        entrada.close();

    }
}