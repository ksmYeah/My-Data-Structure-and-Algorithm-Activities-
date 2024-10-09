import java.util.Arrays;    
import java.util.Scanner;

public class ArrayImplementation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Enter size of an array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Step 2: Enter elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Step 3: Output all the elements in ORDER
        System.out.println("Array elements in order: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        // Step 4: Output the SMALLEST integer in the array
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest element in the array: " + smallest);
        
        // Step 5: Output the EVEN elements of the array
        System.out.println("Even elements in the array: ");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        // Step 6: Output all the elements of the array in DESCENDING ORDER
        Arrays.sort(array);
        System.out.println("Array elements in descending order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
