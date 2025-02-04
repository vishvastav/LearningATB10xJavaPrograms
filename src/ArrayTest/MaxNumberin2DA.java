package ArrayTest;

public class MaxNumberin2DA {
    public static void main(String[] args) {
        int data[][] = {{12,54,51,43}, {53,93,23,53},{33,9,3,6}};

        int max = data[0][1];

        for (int i = 0; i<data.length; i++){

            for (int j = 0;j<data[i].length; j++){


                if (max < data[i][j]){
                    max = data[i][j];
                }
            }

        }System.out.println(max);
    }
}
