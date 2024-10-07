package package1;

public class TheArrays {
    public static void main(String[] args) {
        String[] compLang = new String[4];
        compLang[0] = "java";
        compLang[1] = "c++";
        compLang[2] = "python";
        int n = 1;

        for (int i = 0; i < compLang.length; i++) {
            System.out.println(n + ". " + compLang[i]);
            n = n + 1;
        }
        //Exception Handling
        try {
            System.out.println(compLang[7]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("_________Enhance for loop_________");
        for (String a : compLang) {
            System.out.println(a);
        }
    }
}
