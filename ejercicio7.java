package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("Suma total de todos los elementos: " + sumaTotal);
        
    }
    
}