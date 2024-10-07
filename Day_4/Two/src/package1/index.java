package package1;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("________Grade Calculator________");

        // Student 1
        System.out.print("Enter Student Name: ");
        String s1n1 = sc.nextLine();
        System.out.println("\n Enter Following Subject Marks:- ");
        System.out.print("English:");
        float s1Eng = sc.nextFloat();
        System.out.print("Maths:");
        float s1Math = sc.nextFloat();
        System.out.print("Sci:");
        float s1Sci = sc.nextFloat();

        // Student 2
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String s2n2 = sc.nextLine();
        System.out.println("\n Enter Following Subject Marks:- ");
        System.out.print("English:");
        float s2Eng = sc.nextFloat();
        System.out.print("Maths:");
        float s2Math = sc.nextFloat();
        System.out.print("Sci:");
        float s2Sci = sc.nextFloat();

        // Student 3
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String s3n3 = sc.nextLine();
        System.out.println("\n Enter Following Subject Marks:- ");
        System.out.print("English:");
        float s3Eng = sc.nextFloat();
        System.out.print("Maths:");
        float s3Math = sc.nextFloat();
        System.out.print("Sci:");
        float s3Sci = sc.nextFloat();

        Grade G = new Grade();

        System.out.print("\n" + s1n1 + " having ");
        G.GradeCalcu(s1Eng, s1Math, s1Sci);

        System.out.print(s2n2 + " having ");
        G.GradeCalcu(s2Eng, s2Math, s2Sci);
        
        System.out.print(s3n3 + " having ");
        G.GradeCalcu(s3Eng, s3Math, s3Sci);
        sc.close();
    }
}
