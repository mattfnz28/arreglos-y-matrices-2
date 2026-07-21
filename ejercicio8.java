package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio8 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int sumaDiagonal = 0;
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
    
}
