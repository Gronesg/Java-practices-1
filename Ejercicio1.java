/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma */

import java.util.Scanner;
/*Para implementar la entrada de informacion por teclado, importaremos la clase Scanner, que proviene de la biblioteca de java.util*/

public class Ejercicio1 {
    
    public static void main (String[] args) {
        System.out.println("///////////////////////////////////");

         /*
         Luego se declara una instancia en ella, denominada "entrada" y se inicializa
        pasando como parametro un objeto "InputStream
        */

        Scanner entrada = new Scanner(System.in);            
        int numero1, numero2 , resultado;                              //declarando variables
        System.out.println("Ingrese el primer numero: ");

        /*
        Despues se imprime el aviso correspondiente del tipo de datos que se van a pedir.
        Todo esto se logra mediante el objeto Scanner, llamado entrada, y su metodo next()
        */

        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        resultado = numero1 + numero2;                       //tipica suma de dos numeros
        System.out.println("La suma es: " + resultado);
        entrada.close();                                //.close = para quitar la advertencia pero funciona igual sin el
    }
}
