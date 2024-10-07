package package1;

public class Cars {
    String Model_name;
    int price;
    void cars(){
        System.out.println("Car is:"+Model_name);
        System.out.println("Value of "+Model_name+" is "+price);
    }

    public static void main(String[] args) {
        Cars c=new Cars();

        c.price=550000;
        c.Model_name="BMW";
        c.cars();
        System.out.println();


        c.price=450000;
        c.Model_name="Audi";
        c.cars();
        System.out.println();


        c.price=77000;
        c.Model_name="Maruti";
        c.cars();


    }
}
