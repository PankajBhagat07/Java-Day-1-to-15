package package1;
import package2.*;
public class TestAccess extends AccessMdifire {
    private int q=90;
    public static void main(String[] args) {
        ok x=new ok();
        TestAccess t=new TestAccess();
        AccessMdifire a=new AccessMdifire();
        
        System.out.println(x.a+" I'm Public");
        System.out.println(a.s+" I'm protected");
        System.out.println(t.q+" I'm protected");
        System.out.println(t.b);
    }
}
