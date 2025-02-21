package OOPs.Constructors;

public class Ex_006 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        b1.name = "Divi";
        new Baby();


    }
}

class Baby{
    String name;

    // Default Constructor

    Baby(){
        System.out.println("I am called, Object is created");
    };

    //Instance initialization Block
    {
        System.out.println("I am Instance initialization Block");
    }
}