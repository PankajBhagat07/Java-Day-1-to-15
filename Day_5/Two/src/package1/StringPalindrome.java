package package1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String name = scanner.nextLine();

        String Reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            Reverse = Reverse + name.charAt(i);
        }

        System.out.println(name);

        if (Reverse.equals(name)) {
            System.out.println("Given String is palindrome");
        } 
        else 
        {
            System.out.println("Given String is not palindrome");
        }
        scanner.close();
    }
}
