package package1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of table you want:");
        int table=sc.nextInt();
        int result=0;

        for(int i=1;i<=table;i++){
            for (int j = 1;j<=10; j++) {
                    result=j*i;
                System.out.println(" "+result);
            }

            System.out.println("_____\n");
        }
        sc.close();
    }
}
