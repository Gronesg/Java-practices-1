import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */



public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("/////////////////");
        int numero;
        System.out.print("Ingrese un numero para sacar el doble, triple y su raiz: ");
        numero = entrada.nextInt();
        System.out.println("Doble del numero: " + Math.pow(numero, 2));
        System.out.println("Triple del numero: " + Math.pow(numero, 3));
        System.out.println("Raiz cuadrada del numero: " + Math.sqrt(numero));
        entrada.close();

    }
}
