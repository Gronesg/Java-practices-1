import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

public class Ejercicio3 {
    
    public static void main (String[] args){
        System.out.println("/////////////////////////////");
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();

        System.out.println(frase.toLowerCase() + "\n" + frase.toUpperCase());
        entrada.close();
    }
}
