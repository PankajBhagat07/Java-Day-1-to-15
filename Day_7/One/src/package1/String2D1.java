package package1;

public class String2D1 {
    public static void main(String[] args) {
        String [][] s=new String[3][3];
        s[0][0]="a";
        s[0][1]="b";
        s[0][2]="c";

        s[1][0]="d";
        s[1][1]="e";
        s[1][2]="f";

        s[2][0]="g";
        s[2][1]="h";
        s[2][2]="i";

        for(int i=0;i<s.length;i++) {
            System.out.println();
            for(int j=0;j<2;j++) {
                System.out.print(s[i][j]+" ");
            }
        }
    }
}
