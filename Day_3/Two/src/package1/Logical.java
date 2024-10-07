package package1;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Lets see logical and or");
        System.out.println("________Enter Your speed_____________");

        int speed=s1.nextInt();
        boolean HasPermit=false;

        if (speed<50 || HasPermit) {
            System.out.println("No problem your safe");
        }
        else{
            System.out.println("It's Dangerous");
        }
        s1.close();
    }
}
