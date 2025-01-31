package Task;

public class CLI_Option {
    public static void main(String[] args) {
        /* Take a user input - Name, Age and Salary and print them in the end.*/

        String name = args[0];
        System.out.println("Enter your Name: " + args[0]);
        int age = Integer.parseInt(args[1]);
        System.out.println("Enter your Age: " + args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Enter your Salary: " + args[2]);


        System.out.println("Name: "+ args[0]);
        System.out.println("Age: "+ args[1]);
        System.out.println("Salary: "+ args[2]);



    }
}
