package Exceptions;

public class Handle_Exceptions {
    public static void main(String[] args) {

        System.out.println("1");

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            };
        System.out.println("2");

        }


    }
