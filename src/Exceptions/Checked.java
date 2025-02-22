package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {
    public static void main(String[] args) throws FileNotFoundException {

        //checked JVM knowns about it

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\pc\\Desktop"); //FileNotFoundException
    }
}
