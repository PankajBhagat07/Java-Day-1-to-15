package package1;

public class LearnFinal {
    final int maxSpeed = 60;


    void speed() {
        maxSpeed=80;
        System.out.println("The max speed is:"+maxSpeed);
    }

    public static void main(String[] args) {
        LearnFinal f=new LearnFinal();
        f.speed();
    }
}
