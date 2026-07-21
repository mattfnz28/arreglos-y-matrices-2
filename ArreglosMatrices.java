package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ArreglosMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero para la Posicion " + i + ": ");
            num[i] = sc.nextInt();
        }

        System.out.println("Valores almacenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + num[i]);
        }
    }
    
}
