import java.util.Scanner;

public class PalindromeChecker {
    
    public static boolean isPalindrome(String word) {
       
        word = word.toLowerCase();
      
        int length = word.length();
        
      
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
       
        if (isPalindrome(word)) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }
        
        scanner.close();
    }
}
