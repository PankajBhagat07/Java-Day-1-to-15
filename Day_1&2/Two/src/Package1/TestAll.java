package Package1;

import java.util.*;

public class TestAll {
    public static void main(String[] args) {
        Addition A = new Addition();
        int add = A.Add(10, 25);
        System.out.println("addition is: " + add);

        Substraction S = new Substraction();
        int sub = S.Sub(10, 10);
        System.out.println("Substraction is: " +sub);

        Division D = new Division();
        int Div = D.Div(10, 5);
        System.out.println("Division is: " + Div);

        Multiplecation M = new Multiplecation();
        int Multi = M.Multi(15, 2);
        System.out.println("Multiplecation is: " + Multi);

        Reminder R = new Reminder();
        float Remind = R.Remind(10, 2);
        System.out.println("Reminder is: " + Remind);

        TestAll Test=new TestAll();
        Test.Calculator();

    }
    
    void Calculator(){
        float total=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two no: ");
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();

        System.out.println("\t 1.Addition \n\t 2.Substraction \n\t 3.Multiplecation \n\t 4.Division \n\t 5.Reminder");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                total=num1+num2;
                break;
            case 2:
                total=num1-num2;
                break;
            case 3:
                total=num1*num2;
                break;
            case 4:
                total=num1/num2;
                break;
            case 5:
                total=(num1+num2)%2f;
                break;
            default:
                System.out.println("Enter Valid Choice");
                break;
        }
        System.out.println("The Result is: "+total);
        sc.close();
    }
}
