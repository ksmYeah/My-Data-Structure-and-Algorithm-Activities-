import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Enter size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // 2. Enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // 3. Reverse order
        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // 4. Find the largest element
        int largest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Largest element: " + largest);
        
        // 5. Print odd elements
        System.out.println("Odd elements in the array:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        
        // 6. Sort in ascending order
        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));
        
        scanner.close();
    }
}
