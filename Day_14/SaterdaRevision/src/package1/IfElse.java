package package1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt(); 

        if (age<25) {
            System.out.println("You can't Drink");
        }
        else {
            System.out.println("You Can Drink");
        }
        sc.close();
    }
}
