package package1;

public class HierarchicalInherit {

    void m1() {
        System.out.println("M1");
    }
}

class H1 extends HierarchicalInherit {

    void m2(){
        System.out.println("M2");
    }
}

class H2 extends HierarchicalInherit {
    void m3(){
        System.out.println("M3");
    }

    public static void main(String[] args) {
        H2 h=new H2();
        h.m1();
        h.m3();
    }
}