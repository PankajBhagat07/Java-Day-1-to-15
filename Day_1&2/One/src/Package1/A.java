package Package1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter two numbers to addition: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        B x=new B();
        x.Add(n1,n2);
        sc.close();
    }
}
