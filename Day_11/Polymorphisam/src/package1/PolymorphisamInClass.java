package package1;

public class PolymorphisamInClass {
    void write() {
        System.out.println("I write normal english");
    }

    public static void main(String[] args) {
        PolymorphisamInClass p=new PolymorphisamInClass();
        p.write();

        abhay a=new abhay();
        a.write();
    }
}

class abhay extends PolymorphisamInClass{
    void write() {
        System.out.println("I write cursive");
    }
}
