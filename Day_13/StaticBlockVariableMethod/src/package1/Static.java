package package1;

public  class Static {
    static int n=52;

    static{
        System.out.println("static Block");
    }

    static void m1() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println(n);
        m1();
    }

}
