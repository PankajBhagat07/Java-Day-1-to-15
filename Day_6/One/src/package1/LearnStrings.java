package package1;

public class LearnStrings {
    public static void main(String[] args) {
        String s1=" Coding";
        String s2="Happy";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.contains("t"));
        System.out.println(s1);
        System.out.println(s1.replace("Co","Loa"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.concat(s1));
        System.out.println(s1.isEmpty());
        System.out.println(s1.endsWith("0"));
        System.out.println(s1.hashCode());

    }
}
