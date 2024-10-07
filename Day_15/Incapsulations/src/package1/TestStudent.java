package package1;

public class TestStudent {
    public static void main(String[] args) {
        Student st=new Student();

        st.setName("Pankaj");
        System.out.println(st.getName());
        
        st.setAge(23);
        System.out.println(st.getAge());
    }
}
