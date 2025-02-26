package Collection_Framework.List;

public class ex011_Student {
    private String name;
    private String rollNo;

    public ex011_Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void printDetails(){
        System.out.println("Student Name : "+ this.name);
        System.out.println("Student Roll No : "+ this.rollNo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "ex011_Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
