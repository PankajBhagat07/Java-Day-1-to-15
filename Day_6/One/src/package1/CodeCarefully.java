package package1;

public class CodeCarefully {
    public static void main(String[] args) {
        CodeCarefully x=new CodeCarefully();
        x.m1();
        x.m2();

    }

    void m1() {
        System.out.println("Method 1");
    }

    void m2() {
        System.out.println("Method 2");
        m1();
    }
}
