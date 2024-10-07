package package1;

public class Abs {
    final int num=65; //instance or global variable

    void m2() {
        final int num=9;
        System.out.println(num);
    }
}

class Abs1 extends Abs {
    int num=55; //  instance variable

    void m1() {
        num=45; //local variable
        System.out.println("This is using super keyword: "+super.num);
        System.out.println("this is using this keyword: "+this.num);
        System.out.println("This is normal by local variable: "+num);
        System.out.println();
    }
}
