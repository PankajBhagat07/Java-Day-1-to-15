package package1;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter no to print Fabonacci no:");
        int number=scanner.nextInt();
        int a=0;
        int b=1;

        System.out.print(a);
        for(int i=1;i<=number;i++) {
            int c=a+b;
            System.out.print(","+b);
            a=b;
            b=c;

        }
        scanner.close();
    }
}
