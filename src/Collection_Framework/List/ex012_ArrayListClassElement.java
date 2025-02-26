package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex012_ArrayListClassElement {
    public static void main(String[] args) {
        ex011_Student s1 = new ex011_Student("Amit","1");
        ex011_Student s2 = new ex011_Student("Ritwik","2");
        ex011_Student s3 = new ex011_Student("Shubham","3");

        List<ex011_Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        System.out.println(myStudent);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
