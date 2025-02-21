package OOPs.StaticKeyword;

public class staticExample {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);
//        System.out.println(s1);
//        System.out.println(s2.age);
        System.out.println(Student.Course_name);

    }

}

class Student{
    int age;
    static String Course_name="ATB";

    public Student(int age_c){
        this.age=age_c;
    }
}