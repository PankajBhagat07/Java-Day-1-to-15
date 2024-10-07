package package1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");      
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}
