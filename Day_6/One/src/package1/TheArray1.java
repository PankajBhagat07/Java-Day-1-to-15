package package1;

public class TheArray1 {
    public static void main(String[] args) {
        int [] num={12,45,32,87,9,54,43};

        System.out.println(num[2]);
        System.out.println(num[0]);
        System.out.println(num.length);
        System.out.println("___________for loop_____________");
        
        for(int i=0;i<num.length;i++) {
            System.out.println(num[i]);
        }
    }
}
