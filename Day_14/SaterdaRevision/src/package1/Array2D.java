package package1;

public class Array2D {
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0;i<2;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int[]x:arr) {
            System.out.println();
            for(int z : x) {
                System.out.print(z+" ");
            }
        }
    }
}
