package package1;

public class Constructor1 {
    Constructor1() {
        System.out.println("hi, it is a default cunstructor");
    }

    Constructor1(int age) {
        System.out.println("My age is:"+age);
    }

    Constructor1(String name,int age) {
        System.out.println("My name is "+name+" and i am "+age+" year old");
    }

    public static void main(String[] args) {
        Constructor1 con=new Constructor1("ram",25);
        Constructor1 con1=new Constructor1(5);
        Constructor1 con2=new Constructor1("raju",28);
        Constructor1 con3=new Constructor1();
        
    }
}
