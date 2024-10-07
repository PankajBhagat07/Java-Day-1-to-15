package package1;


public class Array1 {
    public static void main(String[] args) {
        int [][] a={
            {98,65,84},
            {85,96,98},
            {86,35,12}
        };
   
        for(int[]x:a) {
            System.out.println();
            for(int z : x) {
                System.out.print(z+" ");
            }
        }
    }
}
