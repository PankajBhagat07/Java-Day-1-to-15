package package1;

public class College extends School {

    int age=18;

    void currentAge() {
        int age = 27;
        System.out.println("My age is"+age);
        System.out.println("My age is"+this.age);
        System.out.println("My age "+super.age);

    }
    public static void main(String[] args) {
        College myCollege=new College();
        myCollege.currentAge();
    }
    
}