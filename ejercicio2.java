package arreglos.matrices;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int suma = 0;
        
        for (int i = 0; i <= 9; i++){
            System.out.println("ingresa el numero "+ i +":");
            num[i]=sc.nextInt();
            suma += num[i];
        }
        double pro = 10/suma;
        
        System.out.println("la suma es: "+suma);
        System.out.println("el promedio es: "+pro);
    }
}
