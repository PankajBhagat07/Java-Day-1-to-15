package package1;

import java.util.Scanner;

public class ScannerRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String n=sc.nextLine();

        System.out.println("The name is :"+n);
        sc.close();
    }
}
