package package1;
public class Grade {
    void GradeCalcu(float Eng,float Math,float Sci) {
        float percentage= ((Eng+Math+Sci)*100)/300f;
        if (percentage>=80) {
            System.out.println("Grade: A");
        }
        else if (percentage>=60 && percentage<=79) {
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: C");
        }
    }
}
