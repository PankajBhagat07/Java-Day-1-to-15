package package1;

public abstract class Abstraction {
    void m1() {
        System.out.println("I am a simple method");
    }

     abstract void m2();
}

class Abstraction1 extends Abstraction implements TestInterface,Ok {

    public void m3(){
        System.out.println("M3");
    }
    public void m4() {
        System.out.println("M4");
    }
    @Override
    void m2() {
        System.out.println("hi");
    }
}
