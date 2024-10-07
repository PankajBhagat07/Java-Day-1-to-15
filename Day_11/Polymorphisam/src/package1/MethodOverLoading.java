package package1;

public class MethodOverLoading {
    void add(int a,int b) {
        int c=a+b;
        System.out.println(c);
    }

    void add1(int a,int b,int c) {
        int d=a+b+c;
        System.out.println(d);
    }

    void add2(double a,double b) {
        double c=a+b;
        System.out.println(c);
 
 
    }

    public static void main(String[] args) {
        MethodOverLoading m=new MethodOverLoading();
        m.add(1, 02);
        m.add1(1, 2, 3);
        m.add2(1, 2);
    }
}
