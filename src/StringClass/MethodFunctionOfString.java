package StringClass;

public class MethodFunctionOfString {
    public static void main(String[] args) {

        //.equal: Check if content of two strings are equals or not
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = "     ";
        String str5 = "";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //true

        //.equalsIgnoreCase(): Check if content of two strings are equals or not ignore case sensitivity

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        //.toUpperCase(): convert in upper case ,toLowerCase(): covert in lower case
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        //str1.contains() check if one string contain other
        System.out.println(str1.contains(str3));//true
        System.out.println(str1.contains(str2));//false

        //str1.indexOf() Gwt the index of perticular char and string
        System.out.println(str1.indexOf('t')); // -1
        System.out.println(str1.indexOf('l')); // 2

        //str3.charAt() Get char at perticular index
        System.out.println(str1.charAt(1)); //e

        //str3.length() get length of the sting
        System.out.println(str1.length()); //5

        //str3.isEmpty() check if string length is zero

        System.out.println(str1.isEmpty()); //false
        System.out.println(str5.isEmpty()); // true

        //str3.isBlank() return true if string is empty or contains only white space otherwise false
        System.out.println(str4.isBlank()); //true
        System.out.println(str5.isBlank());// true
        System.out.println(str1.isBlank()); //false

        //str3.replace()
        System.out.println(str1.replace('l','6'));//he66o




    }
}
