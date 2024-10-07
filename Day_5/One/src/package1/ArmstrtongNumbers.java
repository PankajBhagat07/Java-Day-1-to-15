package package1;

public class ArmstrtongNumbers {
    public static void main(String[] args) {
        int n, arg, r, sum = 0;
        n=370;
        arg = n;
        for(int i=1;i<n;i++) {

            while (n > 0) {
                r = n % 10;
                sum = sum + (r*r*r);
                n = n / 10;
            }
        }
        if (sum == arg) {
            System.out.println("Given number is Armstrong.");
        } else {
            System.out.println("The given number is not Armstrong.");
        }
    }
}
