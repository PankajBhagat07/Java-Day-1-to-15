package package1;
public class MultiInherit {
    void m1(){
        System.out.println("I'm in method 1");
    }
}

class c1 extends MultiInherit {
    void m2(){
        System.out.println("I'm in method 2");
    }
}

class c2 extends c1 {
    void m3(){
        System.out.println("I'm in method 3");
    }
}


class c extends MultiInherit{
    void m4(){
        System.out.println("I'm in method 4");
    }
}