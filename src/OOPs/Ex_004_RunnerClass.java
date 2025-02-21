package OOPs;

public class Ex_004_RunnerClass {
    public static void main(String[] args) {
        //this is a runner class
        // we can call or instance of normal call here.
        Student s1 = new Student();

        //1. Student ---- Class Loading
        //2. s1 --------- Object ref
        //3. new Student()----Object Creation
    }
}

class Student{
    // this is a normal class
    String name;
    int age;
    int roll;

    void sleep(){};
}
