package package1;

public abstract class Abstraction {
    

    void m1() {
        System.out.println("I am a simple method");
    }

     abstract void m2();
}

class Abstraction1 extends Abstraction {
    @Override
    void m2() {
        System.out.println("hi");
    }
 }
 
