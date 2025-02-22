package Exceptions;

public class Custome_Exception_Bank_Imp {
    public static void main(String[] args) {
        Custome_Exceptions_Bank sbi = new Custome_Exceptions_Bank("INR",100);
        Custome_Exceptions_Bank ICICI = new Custome_Exceptions_Bank("USD",200);
        int result =sbi.add(ICICI);
        System.out.println(result);
    }
}
