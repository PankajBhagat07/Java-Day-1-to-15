package package1;

public class String2D {
    public static void main(String[] args) {
        String [][] players={{"Rohit","Virat"},{"Surya","Shami"}};

        for(int i=0;i<players.length;i++) {
            System.out.println();
            for(int j=0;j<players[i].length;j++) {
                System.out.println(players[i] [j]+" ");
            }
        }
        for(String[]x:players) {
            System.out.println();
            for(String z : x) {
                System.out.println(z+" ");
            }
        }
    }
}
