package Exceptions;

public class Ex_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the Program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;
        System.out.println(b);
        System.out.println("End the Program");
    }
}
