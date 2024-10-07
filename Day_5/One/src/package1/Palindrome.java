package package1;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1111, pal, r, rev = 0;
        pal = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == pal) {
            System.out.println("Given number is palindrome.");
        } else {
            System.out.println("The given number is not palindrome.");
        }
    }
}
