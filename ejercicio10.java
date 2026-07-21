package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                int numeroIngresado = sc.nextInt();
                matriz[i][j] = numeroIngresado + (i * j);
            }
        }  
        System.out.println("===Matriz resultante===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}