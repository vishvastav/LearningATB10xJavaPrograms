package OOPs.Abstraction;

public class Abstract {
    public static void main(String[] args) {
        Child C = new Child();
        C.loan50k();
        C.loan25k();
        //Father f = new Father(); //Abstract class don't have any object

    }

}

//Abstract Class

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 20K");
    }
}
class  Child extends Father{
    @Override
    void loan50k() {
        System.out.println("Child will pay the loan");
    }
}


