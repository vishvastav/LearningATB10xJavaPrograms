package Ternary;

public class largest_number {
    public static void main(String[] args) {
        //Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        float first_number = 43.00f;
        float second_number = 44.00f;
        float third_number = 43.00f;

        float largest_number = (first_number > second_number) ?(first_number > third_number) ? first_number:third_number
                :(second_number > third_number) ?second_number :third_number;

        System.out.println(largest_number);
    }
}
