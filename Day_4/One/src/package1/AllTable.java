package package1;

import java.util.Scanner;

public class AllTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to print it's table:");
        int table=sc.nextInt();

        for(int i=1;i<=10;i++){
            int result=i*table;
            System.out.println(+i+" x "+table+" = "+result);
        }
        sc.close();
    }
}
