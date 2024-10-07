package package1;

import java.util.Scanner;

public class EvenOdd100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Any Digit of Number: ");
        int Number=scanner.nextInt();
        int evenCount=0,oddCount=0;

        System.out.println("The Even no is: ");
        for(int i=1;i<=Number;i++) {

            if (i%2==0) {
                System.out.print(i+" ");
                evenCount=i+evenCount;
            }
        }
        System.out.println("\n The odd no is: ");
        for(int j=1;j<=Number;j++) {
            if (j%2 !=0) {
                System.out.print(j+" ");
                oddCount=j+oddCount;
            }
        }
        System.out.println("\n The sum of all even no is: "+evenCount);
        System.out.println("The sum of all odd no is: "+oddCount);

        scanner.close();
    }
}
