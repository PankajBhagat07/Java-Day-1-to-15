package package1;

import java.util.Arrays;

public class ArraySecondLargNo {
    public static void main(String[] args) {
        int []n={5,40,35,82,3,32,60,86,85};
        
        Arrays.sort(n);

        
        int a=n.length-2;
        System.out.println("Second Largest No is: "+n[a]);

    }
    
}
