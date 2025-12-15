package org.example.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;


class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
public class ExceptionHandling {
    //throw  and throws useage
    public static void function() throws NullPointerException {
        String str = null;
        if (str == null) {
            throw new NullPointerException("the given string is null");
        }
    }
    public static void checkAge() throws AgeException {
        int age=18;
        if(age<20) {
            throw new AgeException("age is less than 20");
        }
        }
    public static void main(String[] args) throws NullPointerException, IOException {
        int a=10;
        try{
            int result=a/0;

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("this block always run");
        }

        try {
          ExceptionHandling.function();
        } catch (NullPointerException e) {
            System.out.println("The given string is null");
        }

        //try-with resources
        try(FileReader fr=new FileReader("data.txt")) {
            fr.read();
        } catch (IOException e) {
            System.out.println("can't read file");
        }

        try{
            checkAge();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
