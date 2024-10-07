package package1;

import java.util.Scanner;

public class SwitchMe {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("For Month Type '12' or for Day type '7':");
        int word=s1.nextInt();
        if (word==7) {
            System.out.println("____________________________");
            System.out.println("\n1.Sunday\n2.Monday\n3.Tuesday\n4.Wenasday\n5.Thursday\n6.Friday\n7.Saterday");
            System.out.println("____________________________");
            System.out.print("Enter Your Choice:");
            int n1=s1.nextInt();
    
            switch (n1) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wenesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saterday");
                    break;
            
                default:
                    System.out.println("Enter Valid Input");
                    break;
            }
        }
        else if (word==12){          
            System.out.println("____________________________");
            System.out.print("\n1.Jan\n2.Feb\n3.Mar\n4.Apr\n5.May\n6.Jun\n7.Jull");
            System.out.println("\n8.Aug\n9.Sep\n10.Oct\n11.Nov\n12.Dec");
            System.out.println("____________________________");
            System.out.print("Enter Your Choice:");
            int n1=s1.nextInt();
    
            switch (n1) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
                case 3:
                    System.out.println("Mar");
                    break;
                case 4:
                    System.out.println("Apr");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jull");
                    break;
                case 8:
                    System.out.println("Aug");
                    break;
                case 9:
                    System.out.println("Sep");
                    break;
                case 10:
                    System.out.println("Oct");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
            
                default:
                    System.out.println("Enter Valid Input");
                    break;
            }
        }
        else{
            System.out.println("Enter Valid number");
        }
        
        
        System.out.println("____________________________");
        s1.close();
    }
}