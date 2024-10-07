package package1;

public class practice {
    static int a=5;
    static void add(int b) {
        int c=a+b;
        System.out.println("The addition is :"+c);
    }

    static void multi(int d) {
        int c=a*d;
        System.out.println("The Multiplecation is:"+c);
    }

    public static void main(String[] args) {
        practice.add(6);
        multi(8);
    }
}