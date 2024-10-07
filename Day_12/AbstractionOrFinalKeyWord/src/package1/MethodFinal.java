package package1;

public class MethodFinal {
    void add(int a,int b) {
        int c=a+b;
        System.out.println("The addition is:"+c);
    }
}

    class Learn extends MethodFinal {
        void add(double a,double b) {
            double c=a+b;
            System.out.println("The add is:"+c);
        }
    }
`