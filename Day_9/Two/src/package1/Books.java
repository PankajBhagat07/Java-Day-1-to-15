package package1;
public class Books {
    static String college="SBP";

    String sub;
    int price;
    void details() {
        System.out.println("The sub is :"+sub);
        System.out.println("The price is :"+price);

    }

    public static void main(String[] args) {
        System.out.println(college);
        Books b=new Books();
        b.sub="java";
        b.price=575;
        b.details();

        System.out.println(b.sub);
        System.out.println(b.price);

        Books b1=new Books();
        b1.sub="HTML";
        b1.price=65;
        b1.details();

        System.out.println(b1.sub);
        System.out.println(b1.price);
    }
}
