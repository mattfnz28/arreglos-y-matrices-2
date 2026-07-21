package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero entero (" + (i + 1) + "/20): ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("===Resultados===");
        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
    
}