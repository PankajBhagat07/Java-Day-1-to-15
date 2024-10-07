package package1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Your name:");
        String name=s1.nextLine();
        System.out.println("Hii "+name);
        System.out.print("Enter first number:");
        int n1 = s1.nextInt();
        System.out.print("Enter second number:");
        int n2=s1.nextInt();

        int n=n1+n2;
        System.out.println("The sum of "+n1+" and "+n2+" is: "+n);
        String name1=s1.next();
        System.out.println(name1);

        s1.close();

    }
}
