package package1;

import java.util.Arrays;

public class ZeroAtEnd {   
    public static void main(String[] args) {
        int n[] = { 0, 20, 0, 25, 0, 18, 0, 57};
       Arrays.sort(n);
       
       for(int i=n.length-1;i>=0;i--) {
        System.out.println(n[i]);
       }
    }
}
