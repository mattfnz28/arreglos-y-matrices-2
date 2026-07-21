package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < 12; i++) {
            int num;
            do {
                System.out.print("Ingrese un numero positivo para la posicion " + i + ": ");
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Error: El numero tiene que5"
                            + " ser positivo.");
                }
            } while (num < 0); 
            numeros[i] = num + i;
        }
        System.out.println("Arreglo Final");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        } 
    }
    
}