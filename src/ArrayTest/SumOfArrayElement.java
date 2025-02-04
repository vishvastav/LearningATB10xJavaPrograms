package ArrayTest;

public class SumOfArrayElement {
    public static void main(String[] args) {

        int listOfSum [] = {43,46,47,40,12,35};

        int sum = 0;

        for(int i=0; i < listOfSum.length; i++){
            sum = sum + listOfSum[i];
            // System.out.print(listOfSum[i]);
            // System.out.println(" ");
            System.out.println(sum);

        }System.out.println(" end");
        System.out.println(sum);
    }
}

