import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {
    
    public static void main (String[] args) {
        System.out.println("//////////////////////");
        Scanner entrada = new Scanner(System.in);
        int grados;
        float Fahren;
        System.out.println("Ingrese los grados a comparar: ");
        grados = entrada.nextInt();
        Fahren = 32 + (9 * grados / 5);
        System.out.println("//////////////////////");
        System.out.println(grados + "ºC es igual a: " + Fahren + "ºF");
        entrada.close();


    }
}
