package package1;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        System.out.print("Enter number to cheack is it even or odd:");
        int n1=s1.nextInt();

        if (n1%2==0) {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        s1.close();
    }
}
