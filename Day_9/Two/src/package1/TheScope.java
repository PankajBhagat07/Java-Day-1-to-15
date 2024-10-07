package package1;

public class TheScope {
    int Salary =40000;
    void add(int a) {
        int Salary=30000;
        int z=a+Salary;
        System.out.println(z);
    }

    void multi(int d) {
        int Salary=25000;
        int ans =Salary*d;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        TheScope ss=new TheScope();

        ss.add(300);
        System.exit(0);
        ss.multi(5);
    }
}
